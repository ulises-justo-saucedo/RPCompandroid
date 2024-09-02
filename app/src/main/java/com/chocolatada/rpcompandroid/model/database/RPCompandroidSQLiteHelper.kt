package com.chocolatada.rpcompandroid.model.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class RPCompandroidSQLiteHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "RPCompandroid"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(DatabaseQueries.CREATE_RPCHARACTER_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(DatabaseQueries.DROP_RPCHARACTER_TABLE)
        onCreate(db)
    }
}