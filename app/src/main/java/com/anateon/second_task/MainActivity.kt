package com.anateon.second_task

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreference = getSharedPreferences("zaycev_net", Context.MODE_PRIVATE)
        val count = sharedPreference.getInt("count", 0)
        if (count == 3){
            Toast.makeText(this, "3й холодный старт!", Toast.LENGTH_SHORT).show()
        }
    }
}