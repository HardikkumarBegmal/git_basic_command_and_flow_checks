package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//        setContentView(R.layout.activity_main)

        binding?.button?.setOnClickListener {

            Toast.makeText(this, "Button Pressed and the data passed is \n\"${binding?.etTitleOfThePage?.text}\"", Toast.LENGTH_LONG).show()
        }
    }


}