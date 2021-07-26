package com.hyeonseungson.in01bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. BTS 사진 선택
        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)
        val image5 = findViewById<ImageView>(R.id.image_5)
        val image6 = findViewById<ImageView>(R.id.image_6)
        val image7 = findViewById<ImageView>(R.id.image_7)

        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료\ntest06", Toast.LENGTH_LONG).show()

            // 2. 해당 사진 전체화면 출력
            val intent = Intent(this, BTS1Activity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener {
            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, BTS3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, BTS4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, BTS5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, BTS6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, BTS7Activity::class.java)
            startActivity(intent)
        }
    }
}