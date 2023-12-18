package com.selamta.localdatabaseusingroom.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.selamta.localdatabaseusingroom.data.TitleEntity
import com.selamta.localdatabaseusingroom.data.ImageEntity
import com.selamta.localdatabaseusingroom.data.ContentEntity

@Composable
fun MainScreen() {
    val viewModel: MainViewModel = viewModel()

    LazyColumn {
        items(viewModel.titles.value.size) { index ->
            val title = viewModel.titles.value[index]
            val image = viewModel.images.value[index]
            val content = viewModel.contents.value[index]
            DataCard(title, image, content)
        }
    }
}