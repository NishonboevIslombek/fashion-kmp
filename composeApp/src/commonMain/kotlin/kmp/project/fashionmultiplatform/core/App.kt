package kmp.project.fashionmultiplatform.core

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmp.project.fashionmultiplatform.ui.theme.FashionTheme

@Composable
fun App() {
    FashionTheme {
        Scaffold(
            modifier = Modifier.fillMaxWidth(),
            containerColor = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(it)
            ) {
                Text("text", style = MaterialTheme.typography.displayLarge)
                BasicListScreen()
            }
        }
    }
}


@Composable
fun BasicListScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(100) {
            Text(
                text = it.toString(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .border(
                        1.dp,
                        Color.Red,
                        shape = RoundedCornerShape(6.dp)
                    )
            )
        }
    }
}



