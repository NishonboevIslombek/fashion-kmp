package kmp.project.fashionmultiplatform.core.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RoundedActionButton(
    modifier: Modifier = Modifier,
    isDarkButton: Boolean = false,
    text: String
) {
    Button(
        onClick = {

        },
        shape = RoundedCornerShape(90),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isDarkButton) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onPrimary
        ),
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Text(
            text = text.uppercase(),
            color = if (isDarkButton) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.labelLarge
        )
    }
}