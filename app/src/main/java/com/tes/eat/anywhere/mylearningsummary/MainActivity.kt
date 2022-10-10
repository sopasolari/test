package com.tes.eat.anywhere.mylearningsummary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tes.eat.anywhere.mylearningsummary.databinding.ActivityMainBinding
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}