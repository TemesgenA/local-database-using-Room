package com.selamta.localdatabaseusingroom.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ArticleDao {
    @Insert
    suspend fun addArticle(article: Article)

    @Query("SELECT * FROM article_table")
    fun getAllArticles(): List<Article>
}