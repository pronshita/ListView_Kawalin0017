package com.example.listview_0017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Mango","Apple","Coconut","Orange"
        ,"Papaya","Banana","Grape"
        ,"Strawberry","Pineapple","Blueberry")

    val priceArr = arrayOf(200,100,300,230,230,600,300,340,230,200)
    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("friut")

        val mAdp = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)
        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->


            val goPageResult = Intent(context,SecondActivity::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPageResult)
        }
    }
}
