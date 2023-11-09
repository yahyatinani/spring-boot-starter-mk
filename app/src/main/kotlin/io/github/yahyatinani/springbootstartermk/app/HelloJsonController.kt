package io.github.yahyatinani.springbootstartermk.app

import io.github.yahyatinani.springbootstartermk.library.greetings
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloJsonController {
  @RequestMapping("/")
  fun hello(): Map<String, String> = greetings
}
