package com.selamta.localdatabaseusingroom.ui

import androidx.lifecycle.ViewModel
import com.selamta.localdatabaseusingroom.data.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {
    val titles = repository.titles
    val images = repository.images
    val contents = repository.contents
}