package com.example.userapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserDataAdapter(val context: Context, val data:UserResults,val onItemClick:((UserData,Int)->Unit)):RecyclerView.Adapter<UserDataAdapter.UserDataViewHolder>() {
    class UserDataViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val userImage:ImageView=itemView.findViewById(R.id.listitem_picture)
        val userFirstName:TextView=itemView.findViewById(R.id.detail_fName)
        val userLastName:TextView=itemView.findViewById(R.id.detail_lName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataViewHolder {
        val itemView=LayoutInflater.from(context).inflate(R.layout.listitem,parent,false)
        return UserDataViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserDataViewHolder, position: Int) {
        val curData:UserData=data.results[position]
        holder.userFirstName.text=curData.name.first
        holder.userLastName.text=curData.name.last
        holder.itemView.setOnClickListener{onItemClick(curData,position)}
        Glide.with(context).load(curData.picture.large).into(holder.userImage)
    }

    override fun getItemCount(): Int {
        return data.results.size
    }

}