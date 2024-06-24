package com.example.zhikunfan_lab02
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HomeTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_type)
        val textView = findViewById<View>(R.id.textView) as TextView
        registerForContextMenu(textView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.home_type_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.apartment -> startActivity(Intent(this, ApartmentActivity::class.java))
            R.id.detached_home -> startActivity(Intent(this, Detached::class.java))
            R.id.semi_detached_home -> startActivity(Intent(this, SemiDetached::class.java))
            R.id.condominium -> startActivity(Intent(this, Condominum::class.java))
            R.id.townhouse -> startActivity(Intent(this, TownHouse::class.java))
            else -> return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}
