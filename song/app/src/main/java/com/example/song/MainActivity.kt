package com.example.song

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declare the variable
        var genre: String = "action"
        var artist: String = "Adventure"
        var yearReleased: Int = 2020
        var duration: Int = 120
        var country: String = "USA"
        var adultContent: Boolean = false
        var childrenContent: Boolean = true
        var rating: Double = 4.5

        // print out the content of the variables
        println()
        println(genre)
        println(artist)
        println(yearReleased)
        println(duration)
        println(country)
        println(adultContent)
        println(childrenContent)
        println(rating)

    }
}