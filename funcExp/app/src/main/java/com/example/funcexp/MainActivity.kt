package com.example.funcexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.Year
// declared variables
var Artist: String = "Avenger End game"
var Genre: String = "action"
var Year: Int = 2019
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declared function tobe printed to console
        println(genre(Genre))
        println(artist(Artist))
        println(yearReleased(Year))
    }

    // These are functions tobe used in the class
    private fun genre(gen: String):String{
        return gen
    }

    private fun artist(art: String):String{
        return art
    }

    private fun yearReleased(yr: Int):Int{
        return yr
    }
}