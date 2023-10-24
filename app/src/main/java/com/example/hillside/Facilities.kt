@file:Suppress("DEPRECATION")

package com.example.hillside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Facilities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facilities)
        Handler().postDelayed({
            startActivity(Intent(this,Co_courricular::class.java))
            finish()
        },4000)
    }
}