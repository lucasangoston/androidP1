package com.apaprocki.yuka

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.apaprocki.yuka.adapter.ItemAdapter
import com.apaprocki.yuka.data.Datasource

class ProductsListFragment(context : Context) : Fragment() {
    private lateinit var recyclerView : RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val view = inflater.inflate(R.layout.items,container,false)
        val myDataset = Datasource().loadProducts()
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(requireContext(),myDataset)
        recyclerView.setHasFixedSize(true)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}