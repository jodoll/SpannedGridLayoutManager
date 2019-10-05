package com.johannesdoll.spannedgridlayoutmanager.sample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = Adapter()

    private val data = listOf(
        GridItem(0, Color.RED, 2, 2),
        GridItem(1, Color.GREEN, 1, 4),
        GridItem(2, Color.BLUE, 5, 1),
        GridItem(3, Color.YELLOW, 1, 2),
        GridItem(4, Color.LTGRAY, 1, 1)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        adapter.submitList(data)
    }

    private fun setupView() {
        setContentView(R.layout.activity_main)
        recyclerView.apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

}
