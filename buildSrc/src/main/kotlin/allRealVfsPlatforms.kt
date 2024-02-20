import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

fun KotlinMultiplatformExtension.AllRealVfsPlatforms() = this.apply {
    jvm()
}