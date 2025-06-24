// PLUGINS
plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
}

// DEPENDENCIES
dependencies {
    implementation(libs.bundles.javalin.webapp)
    implementation(libs.bundles.jackson)
    implementation(libs.bundles.logging)
    implementation(libs.bundles.hoplite)
    implementation(libs.jackson.dataformat.csv)
    implementation(libs.bundles.webjars)
    testImplementation(libs.bundles.kotest)
    testImplementation(libs.mockk)
}
