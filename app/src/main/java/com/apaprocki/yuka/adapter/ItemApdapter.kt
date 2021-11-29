package com.apaprocki.yuka.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apaprocki.yuka.R
import com.apaprocki.yuka.model.Product

class ItemAdapter(
        private val context: Context,
        private val dataset: List<Product>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nom: TextView = view.findViewById(R.id.nom)
        val marque: TextView = view.findViewById(R.id.marque)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val ranking: ImageView = view.findViewById(R.id.ranking)
        val rankingText: TextView = view.findViewById(R.id.rankingText)
        val calorieText: TextView = view.findViewById(R.id.calorieText)
        val bookmark: ImageView = view.findViewById(R.id.bookmark)
        val calorie: ImageView = view.findViewById(R.id.calorie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.nom.text = context.resources.getString(item.stringResourceId)
        holder.marque.text = context.resources.getString(R.string.marque)
        holder.rankingText.text = context.resources.getString(R.string.nutriscore)
        holder.calorieText.text = context.resources.getString(R.string.calorie)
        holder.imageView.setImageResource(item.imageRessourceId)
        holder.ranking.setImageResource(R.drawable.ic_ranking)
        holder.bookmark.setImageResource(R.drawable.ic_nav_bar_bookmarks)
        holder.calorie.setImageResource(R.drawable.ic_calories)
    }

    override fun getItemCount() = dataset.size

}