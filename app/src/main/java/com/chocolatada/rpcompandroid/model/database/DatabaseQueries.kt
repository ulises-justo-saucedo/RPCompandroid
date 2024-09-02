package com.chocolatada.rpcompandroid.model.database

import android.provider.BaseColumns

object DatabaseQueries {
    const val CREATE_RPCHARACTER_TABLE =
        "CREATE TABLE ${DatabaseContract.RPCharacter.TABLE_NAME}(" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                "${DatabaseContract.RPCharacter.COLUMN_NAME_NAME} TEXT, " +
                "${DatabaseContract.RPCharacter.COLUMN_NAME_SURNAME} TEXT, " +
                "${DatabaseContract.RPCharacter.COLUMN_NAME_AGE} INTEGER, " +
                "${DatabaseContract.RPCharacter.COLUMN_NAME_BACKSTORY} TEXT)"

    const val DROP_RPCHARACTER_TABLE = "DROP TABLE IF EXISTS ${DatabaseContract.RPCharacter.TABLE_NAME}"
}