package io.github.yahyatinani.springbootstartermk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StarterApplication

fun main(args: Array<String>) {
  runApplication<StarterApplication>(*args)
}