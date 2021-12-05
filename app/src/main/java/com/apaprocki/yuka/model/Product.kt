package com.apaprocki.yuka.model

data class Product(
    val id: Int,
    val nom:String,
    val marque: String,
    val codeBarres: String,
    val nutriscore: String,
    val url: String,
    val quantite: String,
    val paysList: String,
    val ingredients: String,
    val substancesList: String,
    val additifsList: String)
{
    override fun toString(): String {
        return "Product(id=$id, nom='$nom', marque='$marque', codeBarres='$codeBarres', nutriscore='$nutriscore', url='$url', quantité='$quantite', paysList='$paysList', ingrédients='$ingredients', substancesList='$substancesList', additifsList='$additifsList')"
    }
}