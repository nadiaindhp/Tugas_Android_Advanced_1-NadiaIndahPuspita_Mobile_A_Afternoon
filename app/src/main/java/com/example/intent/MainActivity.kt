package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.btnBukaSatu)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SatuActivity::class.java)
            startActivity(intent)
        }

        val button1 : Button = findViewById(R.id.btnBukaDua)

        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, DuaActivity::class.java)
            startActivity(intent)
        }

    }

    }