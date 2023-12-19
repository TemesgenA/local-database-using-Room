package com.selamta.localdatabaseusingroom.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Article::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun titleDao(): ArticleDao
}
