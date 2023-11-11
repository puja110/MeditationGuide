package com.demo.namastemeditation.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.namastemeditation.home.MainActivity
import com.demo.namastemeditation.R
import com.demo.namastemeditation.forgot_password.EnterEmailActivity
import com.demo.namastemeditation.register.RegisterActivity
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnForgotPassword = findViewById<AppCompatTextView>(R.id.tvForgotPassword)
        val btnSignUp = findViewById<TextView>(R.id.txtSignUp)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnForgotPassword.setOnClickListener {
            val myIntent = Intent(this, EnterEmailActivity::class.java)
            startActivity(myIntent)
        }

        btnSignUp.setOnClickListener {
            val myIntent = Intent(this, RegisterActivity::class.java)
            startActivity(myIntent)
        }


        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Email field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else if (password.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Password field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else {
                val myIntent = Intent(this, MainActivity::class.java)
                myIntent.flags =
                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(myIntent)
                finish()
            }
        }
    }
}