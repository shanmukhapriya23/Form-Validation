# Task 21: Android Form Validation App

An Android application built with Kotlin and XML that demonstrates client-side input validation for user registration, featuring real-time error handling and a success confirmation screen upon valid submission.

---

## Features
- **Client-Side Input Validation:** 
  - Checks for empty or missing fields before submission.
  - Validates email address format using standard Android patterns.
  - Enforces password length requirements (minimum 6 characters).
  - Validates phone number input length.
- **Inline Error Feedback:** Highlights fields and displays specific error messages directly below invalid inputs.
- **Success Confirmation Card:** Hides the form and transitions to a clean confirmation card ("Form Submitted Successfully!") once all inputs pass validation.
- **Reset Functionality:** Allows users to clear their entries and submit a new response.

---

## Tech Stack & Tools
- **Programming Language:** Kotlin[cite: 1]
- **UI Design:** XML Layouts, Material Design Components (`TextInputLayout`, `MaterialCardView`)
- **IDE:** Android Studio[cite: 1]

---

## How to Run the App
1. Open **Android Studio**[cite: 1].
2. Open or import this project folder.
3. Allow Gradle to sync and download necessary dependencies.
4. Connect an Android device via USB (with *USB Debugging* enabled) or create/launch a virtual device via the **Device Manager**.
5. Click the green **Run (Play)** button at the top toolbar to build and install the app on your device or emulator.
