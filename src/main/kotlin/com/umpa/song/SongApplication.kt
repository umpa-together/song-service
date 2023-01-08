package com.umpa.song

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SongApplication

fun main(args: Array<String>) {
	runApplication<SongApplication>(*args)
}
