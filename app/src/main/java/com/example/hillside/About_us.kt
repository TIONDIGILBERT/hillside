@file:Suppress("DEPRECATION")

package com.example.hillside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class About_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        Handler().postDelayed({
            startActivity(Intent(this,Nursery::class.java))
            finish()
        },10000)
    }
}