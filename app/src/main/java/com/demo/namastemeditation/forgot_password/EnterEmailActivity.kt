package com.demo.namastemeditation.forgot_password

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.namastemeditation.R
import com.google.android.material.snackbar.Snackbar

class EnterEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_email)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnBack = findViewById<ImageView>(R.id.imageArrowLeft)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnSendOtp = findViewById<Button>(R.id.btnSendOtp)

        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnSendOtp.setOnClickListener {
            val email = etEmail.text.toString().trim()

            if (email.isEmpty()) {
                val snackbar = Snackbar
                    .make(constraintLayout, "Email field cannot be empty!", Snackbar.LENGTH_LONG)
                snackbar.show()
            } else {
                val myIntent = Intent(this, VerifyEmailActivity::class.java)
                startActivity(myIntent)
            }
        }
    }
}