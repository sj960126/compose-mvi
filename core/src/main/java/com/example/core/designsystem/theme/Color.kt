package com.example.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * @author songhyeonsu
 * Created 2/13/24 at 5:32 PM
 */

@Immutable
data class ColorSystem(
    val primary : Color,
    val tintPrimary : Color,
    val transparent : Color,
    val gray01 : Color,
    val gray02 : Color,
    val gray03 : Color,
    val gray04 : Color,
    val gray05 : Color,
    val gray06 : Color,
    val gray07 : Color,
    val gray08 : Color,
    val gray09 : Color
)

val lightSearchColors: ColorSystem = ColorSystem(
    primary = Color(0xfff3554b),
    tintPrimary = Color(0xFFFFF3554B),
    transparent = Color(0x00000000),
    gray01 = Color(0xFF24262a),
    gray02 = Color(0xFF363A3C),
    gray03 = Color(0xff7f7f82),
    gray04 = Color(0xFF878D91),
    gray05 = Color(0xFFA9AFB3),
    gray06 = Color(0xFFCED3D6),
    gray07 = Color(0xFFE1E4E6),
    gray08 = Color(0xFFF2F4F5),
    gray09 = Color(0xFFFAFAFA)
)

val darkSearchColors: ColorSystem = ColorSystem(
    primary = Color(0xfff3554b),
    tintPrimary = Color(0xFFFFF3554B),
    transparent = Color(0x00000000),
    gray01 = Color(0xFFFAFAFA),
    gray02 = Color(0xFFF2F4F5),
    gray03 = Color(0xFFE1E4E6),
    gray04 = Color(0xFFCED3D6),
    gray05 = Color(0xFFA9AFB3),
    gray06 = Color(0xFF878D91),
    gray07 = Color(0xff7f7f82),
    gray08 = Color(0xFF363A3C),
    gray09 = Color(0xFF24262a)
)
