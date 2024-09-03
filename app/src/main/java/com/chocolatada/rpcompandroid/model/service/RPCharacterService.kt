package com.chocolatada.rpcompandroid.model.service

import android.content.ContentValues
import android.content.Context
import com.chocolatada.rpcompandroid.model.database.DatabaseContract
import com.chocolatada.rpcompandroid.model.database.RPCompandroidSQLiteHelper
import com.chocolatada.rpcompandroid.model.entity.RPCharacter
import com.chocolatada.rpcompandroid.view.CreateCharacterActivity

class RPCharacterService(private var context: Context, private var createCharacterActivity: CreateCharacterActivity) {
    fun createCharacter(rpCharacter: RPCharacter): Long {
        val db = RPCompandroidSQLiteHelper(context).writableDatabase

        val data = ContentValues().apply {
            put(DatabaseContract.RPCharacter.COLUMN_NAME_NAME, rpCharacter.name)
            put(DatabaseContract.RPCharacter.COLUMN_NAME_SURNAME, rpCharacter.surname)
            put(DatabaseContract.RPCharacter.COLUMN_NAME_AGE, rpCharacter.age)
            put(DatabaseContract.RPCharacter.COLUMN_NAME_BACKSTORY, rpCharacter.backstory)
        }

        val id = db.insert(DatabaseContract.RPCharacter.TABLE_NAME, null, data)

        db.close()

        return id
    }
}