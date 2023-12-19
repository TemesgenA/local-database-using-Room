package com.selamta.localdatabaseusingroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
@Dao
interface ArticleDao {
    @Insert
    suspend fun addArticle(article: Article)

    @Query("SELECT * FROM article_table")
    suspend fun getAllArticles(): List<Article>
}