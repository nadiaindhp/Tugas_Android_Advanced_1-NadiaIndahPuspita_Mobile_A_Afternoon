package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class SatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satu)
        val bottomview: BottomNavigationView = findViewById(R.id.bottomview)
        bottomview.setOnNavigationItemReselectedListener { item ->

            when (item.itemId) {
                R.id.home -> {
                    // Handle home navigation
                    val homeIntent = Intent(this@SatuActivity, MainActivity::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.menu -> {
                    // Handle dashboard navigation
                    val menuIntent = Intent(this@SatuActivity, MainActivity::class.java)
                    startActivity(menuIntent)
                    true
                }

                R.id.timer -> {
                    // Handle notifications navigation
                    val timerIntent = android.content.Intent()
                    intent.putExtra("history", "Anda sudah login")
                    setResult(androidx.appcompat.app.AppCompatActivity.RESULT_OK, intent)
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}