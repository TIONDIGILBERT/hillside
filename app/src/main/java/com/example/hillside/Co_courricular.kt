@file:Suppress("DEPRECATION")

package com.example.hillside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Co_courricular : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_co_courricular)
        Handler().postDelayed({
            startActivity(Intent(this,Results::class.java))
            finish()
        },6000)
    }
}