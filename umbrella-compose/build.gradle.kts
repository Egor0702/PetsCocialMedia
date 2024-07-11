plugins{
    id("multiplatform-compose-setup")
    id("android-setup")
}

android {
    namespace = "com.example.petscocialmedia.umbrella_compose"
}

kotlin {
    task("testClasses")
}