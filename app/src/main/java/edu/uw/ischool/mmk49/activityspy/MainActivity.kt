package edu.uw.ischool.mmk49.activityspy

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("lifeCycle", "onCreate event fired")
        super.onCreate(savedInstanceState)
        Log.i("lifeCycle", "savedInstanceState parameter passed: " + savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifeCycle", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifeCycle", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifeCycle", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifeCycle", "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifeCycle", "onDestroy event fired")
        Log.e("lifeCycle", "Get to the chopper")
    }
}