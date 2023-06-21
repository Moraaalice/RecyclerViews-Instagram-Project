package com.example.instagramviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramviews.databinding.InstagramBinding

class Adapter(var instaviews:List<instagramData>):RecyclerView.Adapter<InstagramViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstagramViewHolder {
        var binding = InstagramBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return InstagramViewHolder(binding)
    }

    override fun onBindViewHolder(holder: InstagramViewHolder, position: Int) {
        var instagram = instaviews.get(position)
        holder.binding.itName.text = instagram.name
        holder.binding.itComment.text = instagram.name
    }

    override fun getItemCount(): Int {
        return instaviews.size

    }
}
class InstagramViewHolder(var binding: InstagramBinding):RecyclerView.ViewHolder(binding.root){

}