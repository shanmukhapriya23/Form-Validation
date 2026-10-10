package com.example.formvalidation // Keep your package name

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Views
        val formLayout = findViewById<ScrollView>(R.id.formLayout)
        val successLayout = findViewById<LinearLayout>(R.id.successLayout)

        val etUsername = findViewById<TextInputEditText>(R.id.etUsername)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val etPhone = findViewById<TextInputEditText>(R.id.etPhone)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnSubmit.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val phone = etPhone.text.toString().trim()

            // 1. Username Validation
            if (username.isEmpty()) {
                etUsername.error = "Username is required"
                etUsername.requestFocus()
                return@setOnClickListener
            }

            // 2. Email Validation
            if (email.isEmpty()) {
                etEmail.error = "Email is required"
                etEmail.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "Enter a valid email address"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            // 3. Password Validation
            if (password.isEmpty()) {
                etPassword.error = "Password is required"
                etPassword.requestFocus()
                return@setOnClickListener
            }
            if (password.length < 6) {
                etPassword.error = "Password must be at least 6 characters"
                etPassword.requestFocus()
                return@setOnClickListener
            }

            // 4. Phone Validation
            if (phone.isEmpty()) {
                etPhone.error = "Phone number is required"
                etPhone.requestFocus()
                return@setOnClickListener
            }
            if (phone.length < 10) {
                etPhone.error = "Enter a valid 10-digit phone number"
                etPhone.requestFocus()
                return@setOnClickListener
            }

            // Show Success Card View
            formLayout.visibility = View.GONE
            successLayout.visibility = View.VISIBLE
        }

        // Reset to fill again
        btnReset.setOnClickListener {
            etUsername.text?.clear()
            etEmail.text?.clear()
            etPassword.text?.clear()
            etPhone.text?.clear()

            successLayout.visibility = View.GONE
            formLayout.visibility = View.VISIBLE
        }
    }
}