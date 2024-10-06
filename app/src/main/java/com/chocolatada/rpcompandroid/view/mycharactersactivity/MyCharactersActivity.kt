package com.chocolatada.rpcompandroid.view.mycharactersactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.chocolatada.rpcompandroid.R
import com.chocolatada.rpcompandroid.databinding.ActivityMyCharactersBinding
import com.chocolatada.rpcompandroid.model.service.RPCharacterService
import com.chocolatada.rpcompandroid.view.mycharactersactivity.rpcharacterrecyclerview.RPCharacterAdapter

class MyCharactersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyCharactersBinding
    private lateinit var rpCharacterService: RPCharacterService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initVariables()
        setContentView(binding.root)
    }

    private fun initVariables(){
        binding = ActivityMyCharactersBinding.inflate(layoutInflater)
        rpCharacterService = RPCharacterService(this)
        binding.rvRPCharacters.layoutManager = LinearLayoutManager(this)
        binding.rvRPCharacters.adapter = RPCharacterAdapter(rpCharacterService.getAllCharacters())
    }
}