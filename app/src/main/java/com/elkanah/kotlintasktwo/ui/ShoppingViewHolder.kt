package com.elkanah.kotlintasktwo.ui

import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subject_list_card.view.*

class ShoppingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
   // private var listener: AdapterView.OnItemClickListener? = null
    init {
        itemView.setOnClickListener { this }
    }
    fun bind(item: ShoppingItems){
       itemView.textView.text = item.name
        itemView.textView4.text = item.name?.substring(0,1)
    }

//    fun setListener(listener: AdapterView.OnItemClickListener) {
//        this.listener = listener
//    }

    interface OnItemClickListener{
        fun onItemClick(shopping: ShoppingItems)
    }


}