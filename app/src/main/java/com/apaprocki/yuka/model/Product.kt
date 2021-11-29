package com.apaprocki.yuka.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Product(@StringRes val stringResourceId: Int, @DrawableRes val imageRessourceId: Int)
{

}