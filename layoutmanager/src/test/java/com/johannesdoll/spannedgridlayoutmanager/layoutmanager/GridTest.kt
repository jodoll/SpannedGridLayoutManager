package com.johannesdoll.spannedgridlayoutmanager.layoutmanager

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import org.junit.jupiter.api.Test

class GridTest {

    @Test
    fun `when adding an item at (0,0), it is returned in get(0,0)`() {
        val grid = Grid(2)

        grid.add(0, 0, GridItem(0))
        val item = grid.get(0, 0)

        assertThat(item).isEqualTo(GridItem(0))
    }

    @Test
    fun `when adding an item at (1,0), it is returned in get(1,0)`() {
        val grid = Grid(2)

        grid.add(0, 1, GridItem(0))
        val item = grid.get(0, 1)

        assertThat(item).isEqualTo(GridItem(0))
    }

    @Test
    fun `when adding an item at (0,0), null is returned for get(1,0)`() {
        val grid = Grid(2)

        grid.add(0, 0, GridItem(0))
        val item = grid.get(1, 0)

        assertThat(item).isNull()
    }

    @Test
    fun `when adding an item at (0,0), null is returned for get(0,1)`() {
        val grid = Grid(2)

        grid.add(0, 0, GridItem(0))
        val item = grid.get(0, 1)

        assertThat(item).isNull()
    }
}