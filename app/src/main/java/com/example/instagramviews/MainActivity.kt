package com.example.instagramviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagramviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        instaData()
    }
    fun instaData(){
        val instagram1 = instagramData("Alice","","","","","My love for movies")
        val instagram2 = instagramData("Joyce","","","","","My love for riding bikes")
        val instagram3 = instagramData("Mary","","","","","My love for going out")
        val instagram4 = instagramData("Dante","","","","","My love for mental health")
        val instagram5 = instagramData("Joan","","","","","My love for reading books")
        val instagram6 = instagramData("Mark","","","","","My love for swimming")
        val instagram7 = instagramData("Lucky","","","","","My love for coding")
        val instagram8 = instagramData("Clarine","","","","","My love for my baby")
        val instagram9 = instagramData("Winnie","","","","","My love for football")
        val instaviews = listOf<instagramData>(instagram1,instagram2,instagram3,instagram4,instagram5,instagram6,instagram7,instagram8,instagram9)
        binding.rvInstagram.layoutManager = LinearLayoutManager(this)
        val instaAdapter = Adapter(instaviews)
        binding.rvInstagram.adapter = instaAdapter

    }
}