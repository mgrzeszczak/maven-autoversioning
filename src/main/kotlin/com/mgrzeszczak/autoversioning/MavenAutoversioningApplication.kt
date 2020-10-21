package com.mgrzeszczak.autoversioning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.info.BuildProperties
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MavenAutoversioningApplication

fun main(args: Array<String>) {
	runApplication<MavenAutoversioningApplication>(*args)
}

@RestController
class BuildController(private val buildProperties: BuildProperties) {

	@GetMapping("/api/build")
	fun getBuildProperties() = buildProperties

}