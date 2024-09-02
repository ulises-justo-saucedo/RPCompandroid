package com.chocolatada.rpcompandroid.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chocolatada.rpcompandroid.R
import com.chocolatada.rpcompandroid.databinding.ActivityCreateCharacterBinding

class CreateCharacterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCharacterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners(){
        binding.btnCreate.setOnClickListener {
            TODO("Not yet implemented")
        }

        binding.btnCancel.setOnClickListener {
            finish()
        }
    }
}