package io.github.yahyatinani.springbootstartermk.library

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GreetingsTests {
  @Test
  fun contextLoads() {
    val g = greetings["greetings"]

    assertThat(g).isEqualTo("Hello JSON-over-HTTP API!!")
  }
}
