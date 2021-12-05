package com.apaprocki.yuka

import com.apaprocki.yuka.model.Product

interface ItemClick {
    fun onCellClickListener(data: Product)
}