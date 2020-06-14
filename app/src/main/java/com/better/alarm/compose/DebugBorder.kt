package com.better.alarm.compose

import androidx.compose.foundation.border
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

val borderColors = listOf(
  Color.Black,
  Color.DarkGray,
  Color.Gray,
  Color.LightGray,
  Color.White,
  Color.Red,
  Color.Green,
  Color.Blue,
  Color.Yellow,
  Color.Cyan,
  Color.Magenta,
  Color.Transparent
)

@Composable
fun Modifier.debugBorder(debug: Boolean = true): Modifier {
  return when {
    debug -> border(width = 1.dp, color = borderColors[Random.nextInt(0, borderColors.lastIndex)])
    else -> this
  }
}