package com.onlyteo.sandbox.context

import com.onlyteo.sandbox.config.loadProperties
import com.onlyteo.sandbox.controller.GreetingController
import com.onlyteo.sandbox.properties.ApplicationProperties
import com.onlyteo.sandbox.properties.ApplicationPropertiesHolder
import com.onlyteo.sandbox.properties.ServerProperties
import com.onlyteo.sandbox.properties.ServerPropertiesHolder
import com.onlyteo.sandbox.service.GreetingService

data class ApplicationContext(
    val serverProperties: ServerProperties = loadProperties<ServerPropertiesHolder>().server,
    val applicationProperties: ApplicationProperties = loadProperties<ApplicationPropertiesHolder>().app,
    val greetingService: GreetingService = GreetingService(applicationProperties),
    val greetingController: GreetingController = GreetingController(greetingService)
)
