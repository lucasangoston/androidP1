package com.apaprocki.yuka1

import android.app.ProgressDialog.show
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))
        Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_LONG).show()
        barcode.setBoldText(getString(R.string.barcode))
    }
}

fun TextView.setBoldText(text: String, separator: String = ":") {
    val spannable = SpannableStringBuilder(text)
    spannable.setSpan(StyleSpan(Typeface.BOLD), 0, text.indexOf(separator) + 1, 0)
    this.text = spannable
}

 /*       val TAG = "MyActivity"
        Log.v(TAG, "Hello World")

        Snackbar.make(this.findViewById(android.R.id.content),"Hello warudo",Snackbar.LENGTH_INDEFINITE).apply{
            setAction("Cliquez-moi",object: View.OnClickListener{
                override fun onClick(p0: View?) {
                    //TODO
                }
            })
            show()
        }

    }
}*/