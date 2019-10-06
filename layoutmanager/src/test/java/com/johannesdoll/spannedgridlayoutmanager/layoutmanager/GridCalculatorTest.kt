package com.johannesdoll.spannedgridlayoutmanager.layoutmanager

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GridCalculatorTest {

    @Test
    fun `first item is laid out at top left`() {
        val items = listOf(GridItem(0))

        val grid = GridCalculator(items).calculateGridWithWidth(1)

        assertThat(grid.get(0, 0)).isEqualTo(GridItem(0))
    }

    @Test
    fun `first item is laid out when list contains multiple items`() {
        val items = listOf(GridItem(0), GridItem(1))

        val grid = GridCalculator(items).calculateGridWithWidth(2)

        assertThat(grid.get(0, 0)).isEqualTo(GridItem(0))
    }

    @Test
    fun `second item is laid out to the right of first`() {
        val items = listOf(GridItem(0), GridItem(1))

        val grid = GridCalculator(items).calculateGridWithWidth(2)

        assertThat(grid.get(1, 0)).isEqualTo(GridItem(1))
    }

    @Test
    fun `when row is full, item is added to the next row`() {
        val items = listOf(GridItem(0), GridItem(1))

        val grid = GridCalculator(items).calculateGridWithWidth(1)

        assertThat(grid.get(0, 1)).isEqualTo(GridItem(1))
    }
}