package com.apaprocki.yuka

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.navigation.*

class ProductsFragment(context : Context) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.navigation,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        childFragmentManager?.beginTransaction()?.replace(R.id.product_details_nav_host, ProductsEmpty())
            ?.commitAllowingStateLoss()

        product_details_bottom_nav.setOnNavigationItemSelectedListener { menu ->
            childFragmentManager.beginTransaction()
                .replace(
                    R.id.product_details_nav_host,
                    when (menu.itemId) {
                        R.id.listProduct -> ProductsListFragment(requireContext())
                        R.id.fiche -> ProductDetailsNutritionalValuesFragment()
                        R.id.nutrition -> ProductDetailsNutritionFragment()
                        R.id.tab -> ProductDetailsSummaryFragment()
                        else -> throw Exception()
                    }

                )
                .commitAllowingStateLoss()
            true
        }
    }
}