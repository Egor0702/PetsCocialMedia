plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

android {
    namespace = "com.example.petscocialmedia.android"
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":umbrella-compose"))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    debugImplementation(libs.compose.ui.tooling)
}

//plugins {
//    id("multiplatform-compose-setup")
//    id("android-setup")
//}
//
//android {
//    namespace = "com.example.petscocialmedia.android"
//}
//
//kotlin {
//    task("testClasses")
//}
//
//dependencies {
//    implementation(project(":umbrella-compose"))
//    implementation(libs.compose.ui)
//    implementation(libs.compose.ui.tooling.preview)
//    implementation(libs.compose.material3)
//    implementation(libs.androidx.activity.compose)
//    debugImplementation(libs.compose.ui.tooling)
//}