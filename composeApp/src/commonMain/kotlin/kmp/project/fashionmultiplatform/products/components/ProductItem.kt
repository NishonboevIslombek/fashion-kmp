package kmp.project.fashionmultiplatform.products.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.SubcomposeAsyncImage

@Composable
fun ProductItem(modifier: Modifier = Modifier, title: String, price: Double, image: String) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        SubcomposeAsyncImage(
            model = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            loading = {
                CircularProgressIndicator(
                    color = MaterialTheme.colorScheme.primary,
                    strokeWidth = 1.dp,
                    modifier = Modifier.padding(78.dp)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Text(text = title.uppercase(), style = MaterialTheme.typography.titleSmall)
        Text(text = "$ $price", style = MaterialTheme.typography.labelSmall)
    }
}