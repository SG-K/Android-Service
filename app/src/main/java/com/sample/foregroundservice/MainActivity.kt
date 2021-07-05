package com.sample.foregroundservice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun startSimpleService(view: View){
        val serviceIntent = Intent(this, SimpleForegroundService::class.java)
        serviceIntent.putExtra("inputExtra", "A message toForeground Service")
        startService(serviceIntent)
    }

    fun stopSimpleService(view: View){
        val serviceIntent = Intent(this, SimpleForegroundService::class.java)
        stopService(serviceIntent)
    }

}

