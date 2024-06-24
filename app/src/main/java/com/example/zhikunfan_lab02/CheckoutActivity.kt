package com.example.zhikunfan_lab02


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val selectedHomes = intent.getStringArrayListExtra("selectedHomes") ?: arrayListOf()
        val radioGroupHomes = findViewById<RadioGroup>(R.id.radioGroupHomes)
        val radioGroupPayment = findViewById<RadioGroup>(R.id.radioGroupPayment)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val paymentDetailsLayout = findViewById<View>(R.id.paymentDetailsLayout)

        val editTextFullName = findViewById<EditText>(R.id.editTextFullName)
        val editTextCardNumber = findViewById<EditText>(R.id.editTextCardNumber)
        val editTextFavoriteSport = findViewById<EditText>(R.id.editTextFavoriteSport)
        val editTextFavoriteTeam = findViewById<EditText>(R.id.editTextFavoriteTeam)
        val editTextFavoriteFood = findViewById<EditText>(R.id.editTextFavoriteFood)

        selectedHomes.forEach { home ->
            val radioButton = RadioButton(this)
            radioButton.text = home
            radioGroupHomes.addView(radioButton)
        }

        radioGroupPayment.setOnCheckedChangeListener { _, checkedId ->
            paymentDetailsLayout.visibility = if (checkedId == R.id.radioCredit || checkedId == R.id.radioDebit) {
                View.VISIBLE
            } else {
                View.GONE
            }
        }

        confirmButton.setOnClickListener {
            val intent = Intent(this, FinalOrderActivity::class.java)

            intent.putExtra("fullName", editTextFullName.text.toString())
            intent.putExtra("cardNumber", editTextCardNumber.text.toString())
            intent.putExtra("favoriteSport", editTextFavoriteSport.text.toString())
            intent.putExtra("favoriteTeam", editTextFavoriteTeam.text.toString())
            intent.putExtra("favoriteFood", editTextFavoriteFood.text.toString())
            startActivity(intent)
        }
    }
}

