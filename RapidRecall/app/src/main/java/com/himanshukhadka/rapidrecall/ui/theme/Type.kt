//Pixelify Sans by Stefie Justprince, SIL Open Font License 1.1, https://fonts.google.com/specimen/Pixelify+Sans

package com.himanshukhadka.rapidrecall.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.himanshukhadka.rapidrecall.R
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val PixelifySans = FontFamily(
    Font(R.font.pixelify_sans_regular, FontWeight.Normal),
    Font(R.font.pixelify_sans_medium, FontWeight.Medium),
    Font(R.font.pixelify_sans_semibold, FontWeight.SemiBold),
    Font(R.font.pixelify_sans_bold, FontWeight.Bold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)