package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(private val context: Context, val data:List<Person>,val OnItemClick:((Person,Int)->Unit)):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    class PersonViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var fName:TextView=itemView.findViewById(R.id.list_item_fName)
        var lName:TextView=itemView.findViewById(R.id.list_item_lName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView=LayoutInflater.from(context).inflate(R.layout.listitem,parent,false)
        return PersonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val curData:Person=data[position]
        holder.fName.text=curData.fName
        holder.lName.text=curData.lName
        holder.itemView.setOnClickListener{
            OnItemClick(curData,position)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}