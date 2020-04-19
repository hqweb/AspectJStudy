package com.example.aopstudy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            Log.v("buttonclick", "1111 kotlin")
        }

        button2.setOnClickListener {
            Log.v("buttonclick", "2222 kotlin")
        }
        button3.setOnClickListener {
            Log.v("buttonclick", "3333 kotlin")
        }

        button4.setOnClickListener {
            val intent: Intent =
                Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
