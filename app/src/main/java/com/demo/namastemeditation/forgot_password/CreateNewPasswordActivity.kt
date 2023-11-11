package com.demo.namastemeditation.forgot_password

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.namastemeditation.R
import com.demo.namastemeditation.login.LoginActivity
import com.google.android.material.snackbar.Snackbar

class CreateNewPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnBack = findViewById<ImageView>(R.id.imageArrowLeft)
        val etNewPassword = findViewById<EditText>(R.id.etPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val btnCreatePassword = findViewById<Button>(R.id.btnCreatePassword)

        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnCreatePassword.setOnClickListener {
            val password = etNewPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            if (password.isEmpty()) {
                val snackbar = Snackbar
                    .make(
                        constraintLayout,
                        "Password field cannot be empty!",
                        Snackbar.LENGTH_LONG
                    )
                snackbar.show()
            } else if (confirmPassword.isEmpty()) {
                val snackbar = Snackbar
                    .make(
                        constraintLayout,
                        "Confirm password field cannot be empty!",
                        Snackbar.LENGTH_LONG
                    )
                snackbar.show()
            } else if (password != confirmPassword) {
                val snackbar = Snackbar
                    .make(
                        constraintLayout,
                        "Confirm password and Password should be same!",
                        Snackbar.LENGTH_LONG
                    )
                snackbar.show()
            } else {
                val myIntent = Intent(this, LoginActivity::class.java)
                startActivity(myIntent)
                finish()
            }
        }
    }

}