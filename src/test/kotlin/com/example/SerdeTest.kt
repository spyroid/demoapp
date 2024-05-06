package com.example;

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.assertDoesNotThrow

@MicronautTest
class SerdeTest {

    @Test
    fun test1(@Client("/") httpClient: HttpClient) {
        val client = httpClient.toBlocking()
        assertDoesNotThrow {
            val json = client.retrieve("/p1")
            assertEquals("{\"price\":12.2,\"name\":\"A1\"}", json)

        }
    }

    @Test
    fun test2(@Client("/") httpClient: HttpClient) {
        val client = httpClient.toBlocking()
        assertDoesNotThrow {
            val json = client.retrieve("/p2")
            assertEquals("{\"price\":16.2,\"name\":\"A2\"}", json)
        }
    }
}