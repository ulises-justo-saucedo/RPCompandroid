package com.chocolatada.rpcompandroid.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chocolatada.rpcompandroid.databinding.ActivityCreateCharacterBinding
import com.chocolatada.rpcompandroid.model.entity.RPCharacter
import com.chocolatada.rpcompandroid.model.service.RPCharacterService

class CreateCharacterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCharacterBinding
    private lateinit var rpCharacterService: RPCharacterService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initVariables()
        setContentView(binding.root)
        initListeners()
    }

    private fun initVariables(){
        binding = ActivityCreateCharacterBinding.inflate(layoutInflater)
        rpCharacterService = RPCharacterService(this)
    }

    private fun initListeners(){
        binding.btnCreate.setOnClickListener {
            val name = binding.etName.text.toString()
            val surname = binding.etSurname.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val backstory = binding.etBackstory.text.toString()
            val rpCharacter = RPCharacter(0, name, surname, age, backstory)
            rpCharacterService.createCharacter(rpCharacter)
            finish()
            Toast.makeText(this, "Character successfully saved!", Toast.LENGTH_SHORT).show()
        }

        binding.btnCancel.setOnClickListener {
            finish()
        }
    }
}