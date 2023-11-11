package com.unid.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val userName = findViewById<View>(R.id.username) as TextView
        val beforeIntent = intent
        val username = beforeIntent.getStringExtra("name")
        userName.text = username
        val startBtn = findViewById<View>(R.id.startBtn) as Button
        startBtn.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, StartActivity::class.java)
            startActivity(intent)
        }
    }
}