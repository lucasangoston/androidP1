package com.apaprocki.yuka

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.detail_item.*

class ProductDetailsFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))
        setContentView(R.layout.detail_item)


        val nom = findViewById<TextView>(R.id.nom)
        val marque  = findViewById<TextView>(R.id.marque)
        val code = findViewById<TextView>(R.id.code_barre)
        val quantite = findViewById<TextView>(R.id.quantite)
        val nutriscore = findViewById<ImageView>(R.id.nutriscore)
        val paysList = findViewById<TextView>(R.id.paysList)
        val ingredients = findViewById<TextView>(R.id.ingredients)
        val substanceList = findViewById<TextView>(R.id.substances)
        val additifList = findViewById<TextView>(R.id.additifs)
        val url  = intent.getStringExtra("url")

        nom.text = intent.getStringExtra("nom")
        marque.text = intent.getStringExtra("marque")
        code.text = "Codes barres: " + intent.getStringExtra("codeBarres")
        quantite.text = "Quantité: " + intent.getStringExtra("quantite")

        when(intent.getStringExtra("nutriscore")){
            "A" -> nutriscore.setImageResource(R.drawable.nutriscore_a)
            "B" -> nutriscore.setImageResource(R.drawable.nutriscore_b)
            "C" -> nutriscore.setImageResource(R.drawable.nutriscore_c)
            "D" -> nutriscore.setImageResource(R.drawable.nutriscore_d)
            "E" -> nutriscore.setImageResource(R.drawable.nutriscore_e)
            else -> {
                nutriscore.setImageResource(R.drawable.nutriscore_e)
            }
        }


        paysList.text = "Vendus en: " + intent.getStringExtra("paysList")
        ingredients.text = "Ingrédients: " + intent.getStringExtra("ingredients")
        substanceList.text = "Substances allergènes: " + intent.getStringExtra("substance")
        additifList.text = "Additifs: " + intent.getStringExtra("additif")

        Picasso.get().load(url).into(image)
    }
}