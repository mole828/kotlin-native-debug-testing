plugins {
    kotlin("multiplatform") version "2.3.0"
}

repositories {
    mavenCentral()
}

kotlin {
    macosArm64()

    sourceSets.commonTest.dependencies {
        implementation(kotlin("test"))
    }
}