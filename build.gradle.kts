buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies{
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
    }

}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
}
