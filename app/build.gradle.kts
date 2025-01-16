import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("com.android.application")
    id("org.jetbrains.compose")
}

kotlin {
    jvmToolchain(21)

    jvm()
    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets.commonMain.dependencies {
        implementation(compose.runtime)
        implementation(compose.foundation)
        implementation(compose.material3)
    }

    sourceSets.androidMain.dependencies {
        implementation("androidx.activity:activity-compose:1.9.0")
        implementation("androidx.appcompat:appcompat:1.7.0")
    }
}

android {
    compileSdk = 34
    namespace = "com.gary.kotlinfromscratch"
    defaultConfig {
        applicationId = "com.gary.kotlinfromscratch"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

kotlin.targets.withType<KotlinNativeTarget>().configureEach {
    binaries.framework {
        baseName = "kmp-app-from-scratch"
        isStatic = true
    }
}