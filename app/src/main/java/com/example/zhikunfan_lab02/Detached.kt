package com.example.zhikunfan_lab02

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class Detached : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detached)
        val proceedButton = findViewById<View>(R.id.proceedButton) as Button
        val checkbox_apt1 = findViewById<View>(R.id.checkbox_apt1) as CheckBox
        val checkbox_apt2 = findViewById<View>(R.id.checkbox_apt2) as CheckBox
        registerForContextMenu(proceedButton)


        proceedButton.setOnClickListener {
            val selectedApartments = arrayListOf<String>()
            if (checkbox_apt1.isChecked) selectedApartments.add("Detached Apartment 1 Address, Price")
            if (checkbox_apt2.isChecked) selectedApartments.add("Detached Apartment 2 Address, Price")
            val intent = Intent(this, CheckoutActivity::class.java)
            intent.putStringArrayListExtra("selectedHomes", selectedApartments)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.home_type_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.apartment -> startActivity(Intent(this, ApartmentActivity::class.java))
            R.id.semi_detached_home -> startActivity(Intent(this, SemiDetached::class.java))
            R.id.condominium -> startActivity(Intent(this, Condominum::class.java))
            R.id.townhouse -> startActivity(Intent(this, TownHouse::class.java))
            else -> return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }

}
