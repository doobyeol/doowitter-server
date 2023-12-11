package com.doobyeol.doowitter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoowitterApplication

fun main(args: Array<String>) {
    runApplication<DoowitterApplication>(*args)
}
