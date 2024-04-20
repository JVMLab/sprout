package com.jvmlab.sprout.idempotency.entity

import jakarta.persistence.*
import java.sql.Timestamp


@Entity
@Table(name = "IDEMPOTENCY_LOOKUP")
class IdempotencyLookupEntity(
  @Id
  val externalKey: String,

  @Column(unique=true)
  val internalKey: String,

  @Column
  val timestamp: Timestamp,

  @Column
  val requestHash: String,
)


enum class Status {
  RUNNING,
  ERROR,
  FATAL,
  SUCCESS
}