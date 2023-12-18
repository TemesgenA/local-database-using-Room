package com.selamta.localdatabaseusingroom.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.selamta.localdatabaseusingroom.data.TitleEntity
import com.selamta.localdatabaseusingroom.data.ImageEntity
import com.selamta.localdatabaseusingroom.data.ContentEntity

@Composable
fun DataCard(titleEntity: TitleEntity, imageEntity: ImageEntity, contentEntity: ContentEntity) {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column {
            Text(text = titleEntity.title, modifier = Modifier.padding(8.dp))
            Image(painter = painterResource(id = imageEntity.imageUrl.toInt()), contentDescription = null, contentScale = ContentScale.Crop)
            Text(text = contentEntity.content, modifier = Modifier.padding(8.dp))
        }
    }
}