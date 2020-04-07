package com.elkanah.kotlintasktwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.elkanah.kotlintasktwo.ui.Callback
import com.elkanah.kotlintasktwo.ui.ShoppingItems
import kotlinx.android.synthetic.main.activity_shopping_details.*

class ShoppingDetailsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_details)

        var tvName = findViewById<TextView>(R.id.textView8)
        var tvPrice = findViewById<TextView>(R.id.textView9)
        var tvExpDate = findViewById<TextView>(R.id.textView10)
        var tvDes = findViewById<TextView>(R.id.textView11)
//
//        var bundle = intent.getExtra("Bundle")
//        var item = bundle.getParcelable<ShoppingItems>("shop")
        var ine = intent.getParcelableExtra<ShoppingItems>("shop")
        tvName.text = ine?.name.toString()
        tvPrice.text = ine?.price.toString()
        tvExpDate.text = ine?.expireDate.toString()
        tvDes.text = ine?.descp.toString()
    }



}
