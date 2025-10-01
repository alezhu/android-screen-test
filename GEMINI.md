# Project Overview

This is a simple Android application designed for display testing. Users can tap the screen to cycle through different colors, which can be useful for checking screen uniformity, dead pixels, or color reproduction.

## Technologies Used

*   **Kotlin:** The primary programming language for Android development.
*   **Jetpack Compose:** Android's modern toolkit for building native UI.
*   **Gradle:** The build automation system used for Android projects.

## Building and Running

To build and run this application, you will need the Android SDK and a compatible version of Java.

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-repo/android-screen-test.git
    cd android-screen-test
    ```
2.  **Build the project:**
    ```bash
    ./gradlew build
    ```
3.  **Run on a device or emulator:**
    ```bash
    ./gradlew installDebug
    ```
    Or open the project in Android Studio and run it from there.

## Development Conventions

*   **Architecture:** The application follows a basic MVVM (Model-View-ViewModel) pattern, particularly with the use of `GreetingViewModel` to manage the screen's state (color).
*   **UI:** The user interface is entirely built using Jetpack Compose.
