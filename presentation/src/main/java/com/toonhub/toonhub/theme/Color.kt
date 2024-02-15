package com.toonhub.toonhub.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * @author songhyeonsu
 * Created 2/13/24 at 5:32 PM
 */

@Immutable
data class ColorSystem(
    val primary: Color,
    val primaryDark: Color,
    val accent: Color,
    val accentSecondary: Color,
    val textColorPrimary: Color,
    val textColorSecondary: Color,
    val textHighlighted: Color,
    val background: Color,
    val itemBackground: Color,
    val dialogWindowBackground: Color,
    val bottomNavBackground: Color,
    val bottomTrayBackground: Color,
    val statusBar: Color,
    val selectedTab: Color,
    val unselectedTab: Color
)

val lightSearchColors: ColorSystem = ColorSystem(
    primary = Color(android.graphics.Color.parseColor("#00A2EA")),
    primaryDark = Color(android.graphics.Color.parseColor("#303F9F")),
    accent = Color(android.graphics.Color.parseColor("#FF4081")),
    accentSecondary = Color(android.graphics.Color.parseColor("#2C8A45")),
    textColorPrimary = Color(android.graphics.Color.parseColor("#000000")),
    textColorSecondary = Color(android.graphics.Color.parseColor("#7F7F82")),
    textHighlighted = Color(android.graphics.Color.parseColor("#58B5E5")),
    background = Color(android.graphics.Color.parseColor("#E3E6E9")),
    itemBackground = Color(android.graphics.Color.parseColor("#FFFFFF")),
    dialogWindowBackground = Color(android.graphics.Color.parseColor("#E0E5E9")),
    bottomNavBackground = Color(android.graphics.Color.parseColor("#BBC3C8")),
    bottomTrayBackground = Color(android.graphics.Color.parseColor("#F7F7F7")),
    statusBar = Color(android.graphics.Color.parseColor("#ADB4B9")),
    selectedTab = Color(android.graphics.Color.parseColor("#00A2EA")),
    unselectedTab = Color(android.graphics.Color.parseColor("#7F7F82")),
)

val darkSearchColors: ColorSystem = ColorSystem(
    primary = Color(0xff3f51b5),
    primaryDark = Color(0xff303f9f),
    accent = Color(0xffff4081),
    accentSecondary = Color(0xff54b06d),
    textColorPrimary = Color(0xffffffff),
    textColorSecondary = Color(0xff7f7f82),
    textHighlighted = Color(0xff58b5e5),
    background = Color(0xff2b2c35),
    itemBackground = Color(0xff202026),
    dialogWindowBackground = Color(0xff393a47),
    bottomNavBackground = Color(0xff393A47),
    bottomTrayBackground = Color(0xff4C4E5D),
    statusBar = Color(0xff212027),
    selectedTab = Color(0xff3F51B5),
    unselectedTab = Color(0xff7f7f82)
)
