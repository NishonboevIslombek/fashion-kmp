package kmp.project.fashionmultiplatform.core

import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import kmp.project.fashionmultiplatform.entrance.presentation.EntranceScreen
import kmp.project.fashionmultiplatform.ui.theme.FashionTheme

@Composable
fun App() {
    FashionTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            EntranceScreen(
                modifier = Modifier.padding(
                    top = innerPadding.calculateTopPadding(),
                    start = innerPadding.calculateStartPadding(LayoutDirection.Ltr),
                    end = innerPadding.calculateEndPadding(LayoutDirection.Ltr)
                )
            )
        }
    }
}




