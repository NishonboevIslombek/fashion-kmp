package kmp.project.fashionmultiplatform.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    background = background,
    onBackground = onBackground,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer
)

@Composable
fun FashionTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = FashionTypography(),
        content = content
    )
}