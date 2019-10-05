package com.johannesdoll.spannedgridlayoutmanager.sample

import androidx.annotation.ColorInt

data class GridItem(
    val id: Int,
    @ColorInt val color: Int,
    val width: Int,
    val height: Int
)