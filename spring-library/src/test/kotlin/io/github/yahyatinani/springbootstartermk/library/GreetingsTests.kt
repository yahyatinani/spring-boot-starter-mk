package io.github.yahyatinani.springbootstartermk.library

import io.github.yahyatinani.springbootstartermk.springlibrary.helloSpringLibrary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GreetingsTests {
  @Test
  fun contextLoads() {
    assertThat(helloSpringLibrary).isEqualTo(
      "Hello Spring Boot starter library!"
    )
  }
}
