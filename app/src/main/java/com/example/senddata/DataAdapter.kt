package com.example.senddata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DataAdapter(val dataModelList: List<DataModel>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.model,p0,false))

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val dataModel = dataModelList[p1]
        p0.textTitle.text = dataModel.title

        Picasso.get()
            .load(dataModel.photos)
            .error(R.mipmap.ic_launcher)
            .placeholder(R.mipmap.ic_launcher)
            .into(p0.imageView)


    }

    override fun getItemCount(): Int {
        return dataModelList.size
    }

}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textTitle: TextView = itemView.findViewById(R.id.title)
    var imageView: ImageView

    init {
        imageView = itemView.findViewById(R.id.thumbnail)
    }
}