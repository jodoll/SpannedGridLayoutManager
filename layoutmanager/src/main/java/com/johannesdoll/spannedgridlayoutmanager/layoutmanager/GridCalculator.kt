package com.johannesdoll.spannedgridlayoutmanager.layoutmanager

internal class GridCalculator(private val items: List<GridItem>) {

    fun calculateGridWithWidth(i: Int): Grid {
        val grid = Grid(2)
        for ((i, item) in items.withIndex()) {
            grid.add(i, 0, item)
        }
        return grid
    }

}
