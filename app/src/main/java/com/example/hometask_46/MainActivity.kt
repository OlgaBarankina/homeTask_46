package com.example.hometask_46

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // need to add into manifest <service android:name=".AudioService"



        btStart.setOnClickListener {
            startService(Intent(this, AudioService::class.java))
        }


        btStop.setOnClickListener {
            stopService(Intent(this, AudioService::class.java))
        }



    }
}