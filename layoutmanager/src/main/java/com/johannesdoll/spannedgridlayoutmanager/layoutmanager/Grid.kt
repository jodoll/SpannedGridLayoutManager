package com.johannesdoll.spannedgridlayoutmanager.layoutmanager

class Grid(private val width: Int) {

    private var items = mutableListOf<Array<GridItem?>>()

    fun add(x: Int, y: Int, item: GridItem) {
        resizeItems(y + 1)
        items[y][x] = item
    }

    private fun resizeItems(newSize: Int) {
        for (i in items.size until newSize) {
            items.add(Array(width) { null })
        }
    }

    fun get(x: Int, y: Int): GridItem? {
        if (!isInRange(y, x)) return null
        return items[y][x]
    }

    private fun isInRange(y: Int, x: Int) = y < items.size && x < width

    //data class Position(val x: Int, val y: Int)
}
