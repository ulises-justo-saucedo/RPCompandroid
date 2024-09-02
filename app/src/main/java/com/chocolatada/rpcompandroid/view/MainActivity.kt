package com.chocolatada.rpcompandroid.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chocolatada.rpcompandroid.databinding.ActivityMainBinding
import com.chocolatada.rpcompandroid.view.mycharactersactivity.MyCharactersActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners(){
        binding.btnMyCharacters.setOnClickListener {
            val intent = Intent(this, MyCharactersActivity::class.java)
            startActivity(intent)
        }

        binding.btnCreateCharacter.setOnClickListener {
            val intent = Intent(this, CreateCharacterActivity::class.java)
            startActivity(intent)
        }
    }
}