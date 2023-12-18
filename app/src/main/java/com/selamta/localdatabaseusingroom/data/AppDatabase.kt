package com.selamta.localdatabaseusingroom.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TitleEntity::class, ImageEntity::class, ContentEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun titleDao(): TitleDao
    abstract fun imageDao(): ImageDao
    abstract fun contentDao(): ContentDao
}
