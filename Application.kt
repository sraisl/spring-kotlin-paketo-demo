package demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@RestController
class HelloController {
    @GetMapping("/")
    fun hello(): Map<String, String> =
        mapOf("message" to "hello from spring kotlin paketo")
}
