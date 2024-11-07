package com.onlyteo.sandbox.controller

import com.onlyteo.sandbox.model.Person
import com.onlyteo.sandbox.service.GreetingService
import io.javalin.http.Context
import io.javalin.http.bodyAsClass

class GreetingController(private val greetingService: GreetingService) {

    fun getGreeting(ctx: Context) {
        val person: Person = ctx.bodyAsClass()
        val greeting = greetingService.getGreeting(person)
        ctx.json(greeting)
    }
}