package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ExpencesAdapter (var expensesList:List<Expence>): RecyclerView.Adapter<ExpencesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpencesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.expenses_list_item, parent,false)
        return ExpencesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpencesViewHolder, position: Int) {
        val expence = expensesList[position]
        holder.tvName.text = expence.name
        holder.tvAmount.text = expence.Amount
        holder.tvDate.text = expence.date
    }

    override fun getItemCount(): Int {
        return expensesList.size
    }
}

class ExpencesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}