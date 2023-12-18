package com.selamta.localdatabaseusingroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TitleDao {
    @Query("SELECT * FROM title")
    fun getAllTitles(): LiveData<List<TitleEntity>>

    @Insert
    fun insertTitle(titleEntity: TitleEntity)

    @Update
    fun updateTitle(titleEntity: TitleEntity)

    @Delete
    fun deleteTitle(titleEntity: TitleEntity)
}

@Dao
interface ImageDao {
    @Query("SELECT * FROM image")
    fun getAllImages(): LiveData<List<ImageEntity>>

    @Insert
    fun insertImage(imageEntity: ImageEntity)

    @Update
    fun updateImage(imageEntity: ImageEntity)

    @Delete
    fun deleteImage(imageEntity: ImageEntity)
}

@Dao
interface ContentDao {
    @Query("SELECT * FROM content")
    fun getAllContents(): LiveData<List<ContentEntity>>

    @Insert
    fun insertContent(contentEntity: ContentEntity)

    @Update
    fun updateContent(contentEntity: ContentEntity)

    @Delete
    fun deleteContent(contentEntity: ContentEntity)
}
