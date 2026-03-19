package com.example.vkeducation.presentation.appslist


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import io.mmaltsev.vkeducation.ui.theme.VkEducationTheme


@Composable
fun AppsDetails(
    app: App,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,

        ) {
        AsyncImage(
            model = app.iconUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(92.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(Modifier.width(14.dp))
        Column {
            Text(
                text = app.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = app.description,
                fontSize = 12.sp
            )
            Text(
                text = app.category,
                fontSize = 12.sp,
                color = Color.Gray
            )


        }

    }
}

@Preview
@Composable
private fun Preview() {
    val app = App(
        id = "1",
        name = "СберБанк Онлайн - с Салютом",
        description = "Больше чем банк",
        category = "Финансы",
        iconUrl = "https://static.rustore.ru/imgproxy/XazdQWatYRC8soN-K-yZa5c_Svw-I6X7XrA0AvmYoC0/preset:vk_og_img/plain/https://static.rustore.ru/apk/462271/content/ICON/f1b3c68a-b734-48ce-b62f-490208d3fa0e.png@webp",

        )
    VkEducationTheme {
        AppsDetails(
            app = app,
            modifier = Modifier.fillMaxWidth()
        )
    }
}