package com.onlyteo.sandbox

import com.onlyteo.sandbox.context.ApplicationContext
import com.onlyteo.sandbox.routes.staticRoutes
import io.javalin.Javalin

fun main() {
    with(ApplicationContext()) {
        val app = Javalin.create { config ->
            config.staticRoutes()
        }.start(serverProperties.deployment.port)

        app.post("/api/greetings", greetingController::getGreeting)
    }
}
