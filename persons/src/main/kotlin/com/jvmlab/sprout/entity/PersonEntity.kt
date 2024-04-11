package com.jvmlab.sprout.persons.entity

import jakarta.persistence.*


@Entity
@Table(name = "PERSONS")
data class PersonEntity(
  @Column(unique=true)
  val idCard: String,

  @Column
  val firstName: String,

  @Column
  val lastName: String,

  @Id
  val personId: String
)
