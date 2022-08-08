package com.anateon.second_task

import android.app.Application
import android.content.Context

class App : Application() {

    override fun onCreate() {
        val sharedPreference = getSharedPreferences("zaycev_net", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        var count = sharedPreference.getInt("count", 0)
        count++
        editor.putInt("count", count)
        editor.commit()
        super.onCreate()
    }
}