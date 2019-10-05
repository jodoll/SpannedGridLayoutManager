package com.johannesdoll.spannedgridlayoutmanager.sample

import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class Adapter : ListAdapter<GridItem, Adapter.ViewHolder>(GridItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = TextView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            setPadding(50, 50, 50, 50)
            gravity = Gravity.CENTER
        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.text.text = "Position: $position\nId: ${item.id}"
        holder.text.setBackgroundColor(item.color)
    }

    class ViewHolder(val text: TextView) : RecyclerView.ViewHolder(text)

    private object GridItemDiffCallback : DiffUtil.ItemCallback<GridItem>() {
        override fun areItemsTheSame(oldItem: GridItem, newItem: GridItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: GridItem, newItem: GridItem): Boolean {
            return oldItem == newItem
        }
    }
}