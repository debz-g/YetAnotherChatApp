package dev.redfox.yetanotherchatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.redfox.yetanotherchatapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}