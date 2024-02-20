import dependencies.annotations
import dependencies.coroutines
import dependencies.yoIOCore

plugins {
    kotlin("multiplatform")
}

kotlin {
    AllRealVfsPlatforms()

    sourceSets {
        commonMain {
            dependencies {
                annotations()
                coroutines()
                yoIOCore()
            }
        }
    }
}