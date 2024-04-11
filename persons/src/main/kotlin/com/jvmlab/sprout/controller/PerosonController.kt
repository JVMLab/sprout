package com.jvmlab.sprout.persons.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import com.jvmlab.sprout.persons.dto.CreatePersonReqDTO
import com.jvmlab.sprout.persons.dto.CreatePersonResDTO
import com.jvmlab.sprout.persons.service.PersonService



@RestController
@RequestMapping("/v1/persons")
class PersonController(val PersonService: PersonService) {

  @PostMapping("/create")
  fun create(@RequestBody createPersonReqDTO: CreatePersonReqDTO): CreatePersonResDTO =
          PersonService.create(createPersonReqDTO)

}