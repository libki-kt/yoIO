import dependencies.annotations
import dependencies.coroutines

plugins {
    kotlin("multiplatform")
}

kotlin {
    AllTargets()

    sourceSets {
        commonMain {
            dependencies {
                annotations()
                coroutines()
            }
        }
    }
}