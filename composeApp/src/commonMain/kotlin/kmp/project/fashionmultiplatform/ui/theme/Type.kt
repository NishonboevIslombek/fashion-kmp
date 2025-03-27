package kmp.project.fashionmultiplatform.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fashionmultiplatform.composeapp.generated.resources.CormorantGaramond_Bold
import fashionmultiplatform.composeapp.generated.resources.CormorantGaramond_Light
import fashionmultiplatform.composeapp.generated.resources.CormorantGaramond_Medium
import fashionmultiplatform.composeapp.generated.resources.CormorantGaramond_Regular
import fashionmultiplatform.composeapp.generated.resources.CormorantGaramond_SemiBold
import fashionmultiplatform.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun FashionTypography(): Typography {
    val CormorantGaramontFontFamily = FontFamily(
        Font(resource = Res.font.CormorantGaramond_Bold, weight = FontWeight.Bold),
        Font(resource = Res.font.CormorantGaramond_Regular, weight = FontWeight.Normal),
        Font(resource = Res.font.CormorantGaramond_Light, weight = FontWeight.Light),
        Font(resource = Res.font.CormorantGaramond_SemiBold, weight = FontWeight.SemiBold),
        Font(resource = Res.font.CormorantGaramond_Medium, weight = FontWeight.Medium)
    )

    return Typography(
        displayLarge = TextStyle(
            fontFamily = CormorantGaramontFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 82.sp
        ),
        displaySmall = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        ),
        titleSmall = TextStyle(
            fontFamily = CormorantGaramontFontFamily,
            fontWeight = FontWeight.Light,
            fontSize = 12.sp
        ),
        labelLarge = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.5.sp,
            fontSize = 16.sp
        ),
        labelMedium = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        ),
        labelSmall = TextStyle(
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
    )
}