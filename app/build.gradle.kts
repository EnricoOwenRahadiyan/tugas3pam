plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") // Kotlin for Android
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tugas3pam"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // Android dependencies
    implementation("androidx.core:core-ktx:1.10.1") // Latest AndroidX Core version
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Kotlin Standard Library
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")

    // Rhino (JavaScript engine)
    implementation("org.mozilla:rhino:1.7.13") // Replace with the latest version if necessary

    // Unit Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

// Ensure Kotlin code compatibility
kotlin {
    jvmToolchain(11) // Specify the JVM version if needed
}
