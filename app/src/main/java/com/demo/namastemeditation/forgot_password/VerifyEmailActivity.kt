package com.demo.namastemeditation.forgot_password

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.namastemeditation.R
import com.google.android.material.snackbar.Snackbar

class VerifyEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_email)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnBack = findViewById<ImageView>(R.id.imageArrowLeft)
        val etOtp = findViewById<EditText>(R.id.etOtp)
        val btnVerifyOtp = findViewById<Button>(R.id.btnVerify)

        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnVerifyOtp.setOnClickListener {
            val otp = etOtp.text.toString().trim()

            if (otp.isEmpty()) {
                val snackbar = Snackbar
                    .make(
                        constraintLayout,
                        "Confirmation code field cannot be empty!",
                        Snackbar.LENGTH_LONG
                    )
                snackbar.show()
            } else {
                val myIntent = Intent(this, CreateNewPasswordActivity::class.java)
                startActivity(myIntent)
            }
        }
    }
}