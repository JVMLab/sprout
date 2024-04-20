package com.jvmlab.sprout.persons

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

import com.jvmlab.sprout.idempotency.config.WebConfig



@SpringBootApplication
@Import(WebConfig::class)
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
