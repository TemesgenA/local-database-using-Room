package com.selamta.localdatabaseusingroom.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "article_table")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val image: String,
    val description: String
)
