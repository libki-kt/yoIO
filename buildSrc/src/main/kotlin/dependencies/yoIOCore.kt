package dependencies

import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun KotlinDependencyHandler.yoIOCore() = this.apply {
    api(project(":Core"))
}