package com.jvmlab.sprout.idempotency.config

import com.jvmlab.sprout.idempotency.interceptor.IdempotencyInterceptor
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@ComponentScan("com.jvmlab.sprout.idempotency")
class WebConfig(@Autowired val idempotencyInterceptor: IdempotencyInterceptor) : WebMvcConfigurer {
  private val logger = LoggerFactory.getLogger(this.javaClass)

  init {
    logger.info("Constructor() is called")
  }

  override fun addInterceptors(registry: InterceptorRegistry) {
    super.addInterceptors(registry)
    registry.addInterceptor(idempotencyInterceptor)
  }
}