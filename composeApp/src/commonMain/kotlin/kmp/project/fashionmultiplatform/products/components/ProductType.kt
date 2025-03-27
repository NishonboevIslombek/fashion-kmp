package kmp.project.fashionmultiplatform.products.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProductTypeChip(modifier: Modifier = Modifier, isSelected: Boolean = false, label: String) {
    Text(
        text = label.uppercase(),
        style = MaterialTheme.typography.labelMedium,
        color = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.primary,
        modifier = modifier
            .background(
                if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 12.dp, vertical = 6.dp)

    )
}