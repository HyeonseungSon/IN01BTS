package com.hyeonseungson.in01bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val home = findViewById<TextView>(R.id.home)

        home.setOnClickListener {
            Toast.makeText(this, "초기화면으로", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val text01 = findViewById<TextView>(R.id.text01)
        text01.setOnClickListener {
            Toast.makeText(this, "반갑습니다!", Toast.LENGTH_SHORT).show()
        }

    }
}