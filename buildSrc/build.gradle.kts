plugins{
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven(url="https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(Dependencies.Kotlin.GRADLE_PLUGIN)
    implementation(Dependencies.Compose.GRADLE_PLUGIN)
    implementation(Dependencies.Android.GRADLE_PLUGIN)
}

kotlin {
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}