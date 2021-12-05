package com.apaprocki.yuka.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apaprocki.yuka.ProductDetailsFragment
import com.apaprocki.yuka.R
import com.apaprocki.yuka.model.Product

class ItemAdapter(
        private val context: Context,
        private val dataset: Array<Product>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nom: TextView = view.findViewById(R.id.nom)
        val marque: TextView = view.findViewById(R.id.marqueItem)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val ranking: ImageView = view.findViewById(R.id.ranking)
        val rankingText: TextView = view.findViewById(R.id.rankingText)
        val calorieText: TextView = view.findViewById(R.id.calorieText)
        val bookmark: ImageView = view.findViewById(R.id.bookmark)
        val calorie: ImageView = view.findViewById(R.id.calorie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_display, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        //Charger data item recycler view
        holder.nom.text = item.nom
        holder.marque.text = item.marque
        holder.rankingText.text = "Nutriscore " + item.nutriscore
        holder.calorieText.text =  "134 kCal/part"
        holder.imageView.setImageResource(R.drawable.placeholder)
        holder.ranking.setImageResource(R.drawable.ic_ranking)
        holder.bookmark.setImageResource(R.drawable.ic_nav_bar_bookmarks)
        holder.calorie.setImageResource(R.drawable.ic_calories)

        holder.itemView.setOnClickListener(){
            val i = Intent(context,ProductDetailsFragment::class.java)

            // Charger data item details
            i.putExtra("nom",item.nom)
            i.putExtra("marque",item.marque)
            i.putExtra("codeBarres",item.codeBarres)
            i.putExtra("nutriscore",item.nutriscore)
            i.putExtra("url",item.url)
            i.putExtra("quantite",item.quantite)
            i.putExtra("paysList",item.paysList)
            i.putExtra("ingredients",item.ingredients)
            i.putExtra("substance",item.substancesList)
            i.putExtra("additif",item.additifsList)
            context.startActivity(i)
        }
    }

    override fun getItemCount() = dataset.size
}