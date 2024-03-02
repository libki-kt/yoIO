plugins {
    id("com.github.ben-manes.versions") version "latest.release"
}

allprojects {
    group = "org.duckdns.libki.yoIO"
    version = "pre-0"

    repositories {
        mavenCentral()
    }
}

updatePluginVersions()
