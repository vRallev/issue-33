plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("com.squareup.hephaestus")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")

    api("com.google.dagger:dagger:2.28.1")
    kapt("com.google.dagger:dagger-compiler:2.28.1")
}