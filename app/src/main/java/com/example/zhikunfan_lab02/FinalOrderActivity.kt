package com.example.zhikunfan_lab02

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FinalOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_order)

        val fullName = intent.getStringExtra("fullName")
        val cardNumber = intent.getStringExtra("cardNumber")
        val favoriteSport = intent.getStringExtra("favoriteSport")
        val favoriteTeam = intent.getStringExtra("favoriteTeam")
        val favoriteFood = intent.getStringExtra("favoriteFood")

        val textViewOrderSummary = findViewById<TextView>(R.id.textViewOrderSummary)
        val textViewThankYou = findViewById<TextView>(R.id.textViewThankYou)

        textViewOrderSummary.text = """
            Full Name: $fullName
            Card Number: $cardNumber
            Favorite Sport: $favoriteSport
            Favorite Team: $favoriteTeam
            Favorite Food: $favoriteFood
        """.trimIndent()

        textViewThankYou.text = "Thank you for your order!"
    }
}
