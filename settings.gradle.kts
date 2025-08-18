// PROJECT
rootProject.name = "javalin-sandbox"

// MANAGEMENT
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// PLUGINS
plugins {
    kotlin("jvm") version "2.2.0" apply false
    kotlin("plugin.allopen") version "2.2.0" apply false
    kotlin("plugin.spring") version "2.2.0" apply false
    kotlin("plugin.serialization") version "2.2.0" apply false
    id("org.springframework.boot") version "3.5.4" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
    id("com.google.cloud.tools.jib") version "3.4.5" apply false
    id("org.jooq.jooq-codegen-gradle") version "3.20.6" apply false
    id("com.expediagroup.graphql") version "8.8.1" apply false
}

// APPS
include(":apps:javalin-api-rest:frontend")
include(":apps:javalin-api-rest:frontend-api")
include(":apps:javalin-api-rest:backend")
