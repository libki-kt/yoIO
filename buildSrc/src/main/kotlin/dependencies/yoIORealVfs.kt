package dependencies

import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun KotlinDependencyHandler.yoIORealVfs() = this.apply {
    implementation(project(":RealVfs"))
}