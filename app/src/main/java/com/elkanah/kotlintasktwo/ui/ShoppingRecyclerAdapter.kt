package com.elkanah.kotlintasktwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elkanah.kotlintasktwo.R
import com.elkanah.kotlintasktwo.ShoppingDetailsActivity


class ShoppingRecyclerAdapter(var context: Context, var itemsList: List<ShoppingItems>):
    RecyclerView.Adapter<ShoppingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
       return ShoppingViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.subject_list_card, parent,false))
    }
private var listerner : Callback? = context as Callback

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
       holder.bind(itemsList[position])
        holder.itemView.setOnClickListener{
            listerner?.sendMyDetails(itemsList[position])
        }
    }



}


