package com.selamta.localdatabaseusingroom.data

class Repository(private val titleDao: TitleDao, private val imageDao: ImageDao, private val contentDao: ContentDao) {
    val titles = titleDao.getAllTitles()
    val images = imageDao.getAllImages()
    val contents = contentDao.getAllContents()
}