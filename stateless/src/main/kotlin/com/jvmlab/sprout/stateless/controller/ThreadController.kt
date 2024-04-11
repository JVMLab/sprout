package com.jvmlab.sprout.stateless.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/thread")
class ThreadController() {

  @GetMapping("/current")
  fun getCurrentThread(): String {
    return Thread.currentThread().toString()
  }

  @GetMapping("/count")
  fun getThreadCount(): String {
    return Thread.getAllStackTraces().size.toString()
  }

}