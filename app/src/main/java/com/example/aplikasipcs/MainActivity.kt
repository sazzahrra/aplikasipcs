package com.example.aplikasipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pindah = findViewById<Button>(R.id.pindah)
        val hitung = findViewById<Button>(R.id.hitung)

        pindah.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

        hitung.setOnClickListener {
            val intent = Intent(this, HitungActivity::class.java)
            startActivity(intent)

        }
    }

}