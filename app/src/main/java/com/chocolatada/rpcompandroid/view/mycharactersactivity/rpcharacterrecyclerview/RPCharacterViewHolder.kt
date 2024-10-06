package com.chocolatada.rpcompandroid.view.mycharactersactivity.rpcharacterrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chocolatada.rpcompandroid.R
import com.chocolatada.rpcompandroid.model.entity.RPCharacter

class RPCharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvName = view.findViewById<TextView>(R.id.tvName)
    private val tvSurname = view.findViewById<TextView>(R.id.tvSurname)
    private val tvAge = view.findViewById<TextView>(R.id.tvAge)
    private val tvBackstory = view.findViewById<TextView>(R.id.tvBackstory)

    fun render(rpCharacter: RPCharacter){
        tvName.text = rpCharacter.name
        tvSurname.text = rpCharacter.surname
        tvAge.text = rpCharacter.age.toString()
        tvBackstory.text = rpCharacter.backstory
    }
}