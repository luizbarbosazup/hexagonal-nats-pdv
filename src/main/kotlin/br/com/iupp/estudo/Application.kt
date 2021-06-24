package br.com.iupp.estudo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.iupp.estudo")
		.start()
}

