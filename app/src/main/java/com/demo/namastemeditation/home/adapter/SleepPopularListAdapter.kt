package com.demo.namastemeditation.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.demo.namastemeditation.R
import com.demo.namastemeditation.home.model.SleepPopularResponse

class SleepPopularListAdapter(val itemList: ArrayList<SleepPopularResponse>) :
    RecyclerView.Adapter<SleepPopularListAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SleepPopularListAdapter.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sleep_popular, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: SleepPopularListAdapter.ModelViewHolder, position: Int) {

        Glide.with(holder.image.context)
            .load(
                itemList[position].image
            )
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.logo).into(holder.image)
        holder.title.text = itemList[position].title
        holder.time.text = itemList[position].time
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var time: TextView


        init {
            image = itemView.findViewById(R.id.ivImage) as ImageView
            title = itemView.findViewById(R.id.tvTitle) as TextView
            time = itemView.findViewById(R.id.tvTime) as TextView
        }

    }


}