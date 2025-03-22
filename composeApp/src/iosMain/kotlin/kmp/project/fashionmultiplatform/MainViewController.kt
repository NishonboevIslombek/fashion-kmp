package kmp.project.fashionmultiplatform

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import kmp.project.fashionmultiplatform.core.App
import kmp.project.fashionmultiplatform.ui.theme.FashionTheme

fun MainViewController() = ComposeUIViewController {
    FashionTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            App()
        }
    }

}