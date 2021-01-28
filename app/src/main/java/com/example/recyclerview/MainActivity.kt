package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val item = ArrayList<data>()

        item.add(data("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.carsguide.com.au%2Fcar-news%2Fhave-we-reached-peak-mercedes-amg-79527&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAI" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.caranddriver.com%2Fmercedes-benz%2Feqs&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAN" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.autoevolution.com%2Fmercedes-benz%2F&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAS" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cnet.com%2Froadshow%2Fnews%2Fmercedes-benz-amg-car-subscription-price-features%2F&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAY" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.edmunds.com%2Fmercedes-benz%2Fa-class%2F&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAe" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fmercedes&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAk" +
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.ept.ca%2F2020%2F02%2Fhydro-quebec-partners-with-mercedes-benz-on-battery-rd%2Fhydro-q-mercedes-benz%2F&psig=AOvVaw39uFPFoHz8NXPPusVPK_Bo&ust=1611943909765000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjt1pedv-4CFQAAAAAdAAAAABAq"))

        val adapter= recyclerviewadapter(item)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}