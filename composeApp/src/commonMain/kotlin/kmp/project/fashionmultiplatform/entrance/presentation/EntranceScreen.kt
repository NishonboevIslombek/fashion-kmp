package kmp.project.fashionmultiplatform.entrance.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import fashionmultiplatform.composeapp.generated.resources.Res
import fashionmultiplatform.composeapp.generated.resources.company_motto
import fashionmultiplatform.composeapp.generated.resources.company_name
import fashionmultiplatform.composeapp.generated.resources.entrance
import kmp.project.fashionmultiplatform.core.presentation.components.BasicAutoResizableText
import kmp.project.fashionmultiplatform.core.presentation.components.RoundedActionButton
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun EntranceScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(bottom = 0.dp)) {
        BrandSection()
        ShopButtonsColumn(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp, start = 15.dp, end = 15.dp)
        )
    }
}

@Composable
fun BrandSection(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(Res.string.company_motto),
            style = MaterialTheme.typography.displaySmall,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 48.dp, end = 100.dp, start = 20.dp)
                .weight(1f)
        )
        BasicAutoResizableText(
            text = stringResource(Res.string.company_name),
            style = MaterialTheme.typography.displayLarge
        )
        Image(
            painter = painterResource(Res.drawable.entrance),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(420.dp)
        )
    }
}

@Composable
fun ShopButtonsColumn(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        RoundedActionButton(text = "shop man")
        RoundedActionButton(text = "shop woman")
    }
}