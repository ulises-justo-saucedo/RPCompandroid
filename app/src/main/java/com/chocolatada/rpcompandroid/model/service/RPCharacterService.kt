package com.chocolatada.rpcompandroid.model.service

import android.content.ContentValues
import android.content.Context
import android.util.Log
import com.chocolatada.rpcompandroid.model.database.DatabaseContract
import com.chocolatada.rpcompandroid.model.database.RPCompandroidSQLiteHelper
import com.chocolatada.rpcompandroid.model.entity.RPCharacter
import com.chocolatada.rpcompandroid.view.CreateCharacterActivity

class RPCharacterService(private var context: Context) {
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

    fun getAllCharacters(): MutableList<RPCharacter> {
        val db = RPCompandroidSQLiteHelper(context).readableDatabase
        val cursor = db.query(
            DatabaseContract.RPCharacter.TABLE_NAME,
            null,
            null,
            null,
            null,
            null,
            "${DatabaseContract.RPCharacter.COLUMN_NAME_NAME} DESC"
        )
        val characters: MutableList<RPCharacter> = mutableListOf()

        with(cursor){
            while(moveToNext()){
                val id = getLong(0)
                val name = getString(1)
                val surname = getString(2)
                val age = getInt(3)
                val backstory = getString(4)

                val rpCharacter = RPCharacter(id, name, surname, age, backstory)

                characters.add(rpCharacter)
            }
        }

        db.close()
        cursor.close()

        return characters
    }
}