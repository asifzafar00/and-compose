package com.example.navi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navi.R

class MoreOptionAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<MoreOptionAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.more_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       // holder.bind(position)
    }

    override fun getItemCount() = dataSet.size


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        init {
            itemView.setOnClickListener {

            }
        }



    }
}
