plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation(project(":RealVfs"))
}

application {
    mainClass = "MainKt"
}