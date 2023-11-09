package io.github.yahyatinani.springbootstartermk.app

import io.github.yahyatinani.springbootstartermk.library.helloKotlin
import io.github.yahyatinani.springbootstartermk.springlibrary.helloSpringLibrary
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloJsonController {
  @RequestMapping("/")
  fun hello() = mapOf("greetings" to "Hello JSON-over-HTTP API!!")
    .plus("spring-library" to helloSpringLibrary)
    .plus("kotlin" to helloKotlin)
}
