package com.demo.namastemeditation.register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.namastemeditation.home.MainActivity
import com.demo.namastemeditation.R
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnBack = findViewById<ImageView>(R.id.imageArrowLeft)
        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<TextView>(R.id.txtLogin)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)


        btnLogin.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnSignUp.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (name.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Name field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else if (email.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Email field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else if (password.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Password field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else {
                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
                finish()
            }
        }
    }
}