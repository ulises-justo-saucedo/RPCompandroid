package com.chocolatada.rpcompandroid.view.mycharactersactivity.rpcharacterrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chocolatada.rpcompandroid.R
import com.chocolatada.rpcompandroid.model.entity.RPCharacter

class RPCharacterAdapter(private val rpCharacters: List<RPCharacter>) : RecyclerView.Adapter<RPCharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RPCharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_rpcharacter, parent, false)
        return RPCharacterViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int = rpCharacters.size

    override fun onBindViewHolder(holder: RPCharacterViewHolder, position: Int) {
        holder.render(rpCharacters[position])
    }

}