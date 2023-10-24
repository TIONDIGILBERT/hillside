@file:Suppress("DEPRECATION")

package com.example.hillside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        Handler().postDelayed({
            startActivity(Intent(this,Contact_us::class.java))
            finish()
        },10000)
    }
}