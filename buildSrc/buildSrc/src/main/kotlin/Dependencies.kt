object Dependencies {

    object Kotlin {
        private const val VERSION = "1.9.23"
        const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"
    }

    object Compose {
        private const val VERSION = "1.7.0-alpha01"
        const val GRADLE_PLUGIN = "org.jetbrains.compose:compose-gradle-plugin:$VERSION"
    }

    object Android {
        private const val VERSION = "8.4.1"
        const val GRADLE_PLUGIN = "com.android.tools.build:gradle:$VERSION"
    }
}