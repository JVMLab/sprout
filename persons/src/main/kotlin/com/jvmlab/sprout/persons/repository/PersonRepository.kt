package com.jvmlab.sprout.persons.repository

import org.springframework.data.repository.CrudRepository

import com.jvmlab.sprout.persons.entity.PersonEntity


interface PersonRepository : CrudRepository<PersonEntity, String> {
  fun findByIdCard(idCard: String): PersonEntity
}