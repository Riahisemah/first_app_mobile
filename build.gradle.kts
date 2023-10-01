// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
}

buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.2")

        // Add the following line for SafeArgs
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.0")
    }

}
