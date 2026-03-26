package com.example.vkeducation.presentation.appslist


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.vkeducation.presentation.theme.VkEducationTheme


@Composable
fun AppsDetailsHeader(
    onLogoClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(128.dp)
            .padding(

                top = 32.dp
            )
            .padding(

                horizontal = 16.dp,
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,


        ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { onLogoClick() }

        ) {
            AsyncImage(
                model = "https://storage.yandexcloud.net/incrussia-prod/wp-content/uploads/2025/06/logotip-rustore.webp",
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(Modifier.width(16.dp))
            Text(
                text = "Rustore",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        IconButton(
            onClick = { /* добавить действие */ }
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                tint = Color.White
            )
        }


    }
}

@Preview
@Composable
private fun Preview() {
    VkEducationTheme {
        AppsDetailsHeader(
            onLogoClick = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}