package com.chocolatada.rpcompandroid.model.database

import android.provider.BaseColumns

object DatabaseContract {
    object RPCharacter : BaseColumns {
        const val TABLE_NAME = "RPCharacter"
        const val COLUMN_NAME_NAME = "name"
        const val COLUMN_NAME_SURNAME = "surname"
        const val COLUMN_NAME_AGE = "age"
        const val COLUMN_NAME_BACKSTORY = "backstory"
    }
}