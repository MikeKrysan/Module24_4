package com.mikekrysan.module24_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.action_dial -> Toast.makeText(this, "Dial", Toast.LENGTH_SHORT).show()
                R.id.action_mail -> Toast.makeText(this, "Mail", Toast.LENGTH_SHORT).show()
                R.id.action_map -> Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show()
            }
            false
        }
    }
}