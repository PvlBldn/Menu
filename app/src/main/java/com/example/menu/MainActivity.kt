package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val text: TextView = findViewById(R.id.textView)
        when (item.itemId) {
            R.id.action_cat1 -> {
                text.text = "Вы выбрали кота!"
                return true
            }
            R.id.action_cat2 -> {
                text.text = "Вы выбрали кошку!"
                return true
            }
            R.id.action_cat3 -> {
                text.text = "Вы выбрали котёнка!"
                return true
            }
            R.id.action_settings -> {
                text.text = "You chose settings!"
                return true
            }
        }
            return super.onOptionsItemSelected(item)

    }
}