package com.apaprocki.yuka.data
import com.apaprocki.yuka.R
import com.apaprocki.yuka.model.Product

class Datasource {
    fun loadProducts() : List<Product>{
        return listOf<Product>(
                Product(R.string.nom,R.drawable.placeholder),
                Product(R.string.nom,R.drawable.placeholder),
                Product(R.string.nom,R.drawable.placeholder),
                Product(R.string.nom,R.drawable.placeholder),
                Product(R.string.nom,R.drawable.placeholder),
        )

    }
}