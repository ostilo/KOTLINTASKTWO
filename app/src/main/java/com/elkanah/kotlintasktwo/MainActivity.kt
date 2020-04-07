package com.elkanah.kotlintasktwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.elkanah.kotlintasktwo.ui.Callback
import com.elkanah.kotlintasktwo.ui.ShoppingItems
import com.elkanah.kotlintasktwo.ui.ShoppingRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Callback{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var toolbar:Toolbar = findViewById(R.id.withdraw_toolbar)
        toolbar.title = "My Shopping List"
        with(subject_recycler){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter= ShoppingRecyclerAdapter(context, populate()
            )
        }

    }

    public fun populate(): List<ShoppingItems>{
        return  listOf(
            ShoppingItems(
                "Brandy",
                20000,
                "A refreshing Wine",
                "2/2/2020"
            ),
            ShoppingItems(
                "Shoes",
                2000,
                "It relieves Stress",
                "2/1/2019"
            ),
            ShoppingItems(
                "Sandal",
                4000,
                "A refreshing Stress",
                "2/2/2018"
            ),
            ShoppingItems(
                "Cloth",
                8000,
                "Gives the body a good shape and doesn't get stained",
                "2/2/2012"
            ),
            ShoppingItems(
                "Snacks",
                200,
                "Good for the body",
                "2/0/2013"
            )
        )
    }

    override fun sendMyDetails(items: ShoppingItems) {
        val intent = Intent(applicationContext, ShoppingDetailsActivity::class.java)
        intent.putExtra("shop",items)
        startActivity(intent)
    }

    override fun passBundle(bundle: Intent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

//    override fun passBundle(bundle: Intent) {
//        var intent = Intent(applicationContext,ShoppingDetailsActivity::class.java)
//        intent.putExtra("shop",bundle)
//        startActivity(intent)
//    }
}

