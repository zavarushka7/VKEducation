package com.example.vkeducation

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.vkeducation.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.getStringExtra("TEXT_FROM_FIRST_ACTIVITY")
        binding.textFromFirstActivity.text = text
    }
}