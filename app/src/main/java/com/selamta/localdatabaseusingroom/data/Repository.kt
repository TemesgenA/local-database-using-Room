package com.selamta.localdatabaseusingroom.data

class Repository(private val articleDao: ArticleDao) {
    val article = articleDao.getAllArticles()
}