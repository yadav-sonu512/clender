package com.example.clender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler

class homeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        android.os.Handler().postDelayed(Runnable {
            val  intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
          },2000)
    }
}