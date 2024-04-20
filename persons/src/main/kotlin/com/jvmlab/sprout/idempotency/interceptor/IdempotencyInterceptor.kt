package com.jvmlab.sprout.idempotency.interceptor

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor


@Component
class IdempotencyInterceptor : HandlerInterceptor {
  private val logger = LoggerFactory.getLogger(this.javaClass)

  init {
    logger.info("Constructor() is called")
  }


  override fun preHandle(request: HttpServletRequest,
                         response: HttpServletResponse, handler: Any): Boolean {
    logger.info("preHandle() is called")
    return super.preHandle(request, response, handler)
  }
}
