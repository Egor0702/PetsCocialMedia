plugins{
    id("multiplatform-setup")
    id("android-setup")
}

android{
    namespace = "com.example.petscocialmedia.umbrella_ios"
}

kotlin {
    task("testClasses")
}