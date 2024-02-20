//utils
include(":Annotations")

//components
include(":Core")
include(":RealVfs")

//test
include(":Test")


rootProject.name = "yoIO"

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "latest.release"
    kotlin("multiplatform") version "1.9.22" apply false
    kotlin("jvm") version "1.9.22" apply false
}
