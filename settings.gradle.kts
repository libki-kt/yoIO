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

    val kotlinVersion = extra["kotlin.version"]

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.multiplatform" -> useModule(
                    "org.jetbrains.kotlin.multiplatform:org.jetbrains.kotlin.multiplatform.gradle.plugin:$kotlinVersion"
                )

                "org.jetbrains.kotlin.jvm" -> useModule(
                    "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinVersion"
                )

                /*"org.jetbrains.kotlin.plugin.serialization" -> useModule(
                    "org.jetbrains.kotlin.plugin.serialization:org.jetbrains.kotlin.plugin.serialization.gradle.plugin:$kotlinVersion"
                )*/
            }
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "latest.release"
    kotlin("multiplatform") apply false
    kotlin("jvm") apply false
}
