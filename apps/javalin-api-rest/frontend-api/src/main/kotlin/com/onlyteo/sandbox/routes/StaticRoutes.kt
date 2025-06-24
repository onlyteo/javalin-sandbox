package com.onlyteo.sandbox.routes

import io.javalin.config.JavalinConfig

fun JavalinConfig.staticRoutes() {
    staticFiles.add { config ->
        config.hostedPath = "/"
        config.directory = "/static"
    }
}
