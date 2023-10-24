@file:Suppress("DEPRECATION")

package com.example.hillside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Contact_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        Handler().postDelayed({
            startActivity(Intent(this,Home::class.java))
            finish()
        },8000)
    }
}