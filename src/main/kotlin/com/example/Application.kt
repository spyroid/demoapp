package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut.run
import io.micronaut.serde.annotation.SerdeImport

fun main(args: Array<String>) {
    run(*args)
}

@SerdeImport(Product::class)
@SerdeImport(Product2::class)
class Serdes {}

@Controller
class Api {
    @Get("/p1")
    fun p1() = Product(12.2, "A1")

    @Get("/p2")
    fun p2() = Product2(16.2, "A2")
}