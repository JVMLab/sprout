package com.jvmlab.sprout.persons.service

import java.util.*
import org.springframework.stereotype.Service
import org.springframework.dao.DataIntegrityViolationException

import com.jvmlab.sprout.persons.dto.CreatePersonReqDTO
import com.jvmlab.sprout.persons.dto.CreatePersonResDTO
import com.jvmlab.sprout.persons.entity.PersonEntity
import com.jvmlab.sprout.persons.repository.PersonRepository


@Service
class PersonService(val repository: PersonRepository) {

  fun create(createPersonReqDTO: CreatePersonReqDTO): CreatePersonResDTO {
    val PersonEntity = PersonEntity(
      createPersonReqDTO.idCard,
      createPersonReqDTO.firstName,
      createPersonReqDTO.lastName,
      UUID.randomUUID().toString()
      )

    try {
      repository.save(PersonEntity)
    }
    catch(ex: DataIntegrityViolationException) {
      val existingEntity = repository.findByIdCard(createPersonReqDTO.idCard)
      return CreatePersonResDTO(existingEntity.idCard, existingEntity.personId)
    }

    return CreatePersonResDTO(PersonEntity.idCard, PersonEntity.personId)
  }
  
}