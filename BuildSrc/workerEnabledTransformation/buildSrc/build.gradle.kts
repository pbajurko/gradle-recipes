plugins {
    kotlin("jvm") version "1.3.72"
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle-api:4.1.0")
    implementation(kotlin("stdlib"))
    gradleApi()
}
