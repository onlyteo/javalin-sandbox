package com.onlyteo.sandbox.service

import com.fasterxml.jackson.module.kotlin.readValue
import com.onlyteo.sandbox.config.buildLogger
import com.onlyteo.sandbox.config.buildObjectMapper
import com.onlyteo.sandbox.model.Greeting
import com.onlyteo.sandbox.model.Person
import com.onlyteo.sandbox.properties.ApplicationProperties
import io.javalin.http.ContentType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class GreetingService(
    private val properties: ApplicationProperties,
) {
    private val logger = buildLogger
    private val objectMapper = buildObjectMapper
    private val httpClient = OkHttpClient()

    fun getGreeting(person: Person): Greeting {
        logger.info("Fetching greeting for {}", person.name)
        val requestBody = objectMapper.writeValueAsString(person).toRequestBody(ContentType.JSON.toMediaType())
        val request = Request.Builder()
            .url(properties.integrations.backend.url)
            .post(requestBody)
            .build()
        val response = httpClient.newCall(request).execute()
        val responseBody = response.body?.string() ?: throw IllegalStateException("Null response body")
        return objectMapper.readValue<Greeting>(responseBody)
    }
}