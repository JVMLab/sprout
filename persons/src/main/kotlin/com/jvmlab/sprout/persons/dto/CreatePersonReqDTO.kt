package com.jvmlab.sprout.persons.dto


import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull


data class CreatePersonReqDTO(
  @JsonProperty("id_card")
  @NotNull(message = "id_card is mandatory")
  val idCard: String,

  @JsonProperty("first_name")
  val firstName: String,

  @JsonProperty("last_name")
  val lastName: String
)