package com.example.zhikunfan_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton: Button = findViewById(R.id.enter_button)
        enterButton.setOnClickListener {
            val intent = Intent(this, HomeTypeActivity::class.java)
            startActivity(intent)
        }
    }
}
