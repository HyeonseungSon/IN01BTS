package com.hyeonseungson.in01bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. id 값을 통해 View 에 접근합니다.
        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)
        val image5 = findViewById<ImageView>(R.id.image_5)
        val image6 = findViewById<ImageView>(R.id.image_6)
        val image7 = findViewById<ImageView>(R.id.image_7)
        val text1 = findViewById<TextView>(R.id.text01)

        /*
        setOnClickListener 를 통해 해당 View 에 Click Event 가 발생했을 경우
        중괄호 이후 Code 를 실행합니다.
         */
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료\ntest06", Toast.LENGTH_LONG).show()

            // 2. Intent() 를 통해 Activity 파일에 접근할 수 있습니다.
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

        text1.setOnClickListener {
            val intent = Intent(this, TextActivity::class.java)
            startActivity(intent)
        }
    }
}