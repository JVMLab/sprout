package com.jvmlab.sprout.persons.dto


import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull


data class CreatePersonResDTO(
  @JsonProperty("id_card")
  @NotNull(message = "id_card is mandatory")
  val idCard: String,

  @JsonProperty("person_id")
  @NotNull(message = "person_id is mandatory")
  val personId: String
)