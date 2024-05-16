package com.plcoding.cryptocurrencyappyt.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
    /*h1 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 30.sp,
    ),
    h2 = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp
    ),
    h3 = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 20.sp
    ),
    h4 = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp
    ),
    body1 = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp
    ),
    body2 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp*/
)