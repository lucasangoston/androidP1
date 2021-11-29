package com.apaprocki.yuka

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.apaprocki.yuka.adapter.ItemAdapter
import com.apaprocki.yuka.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadProducts()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_view, ProductsDetailFragment())
            .commitAllowingStateLoss()
    }
}