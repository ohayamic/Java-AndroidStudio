package com.example.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /* This is an ordered collection of item, it can be mutable or read-only
        * according to what is needed. The major difference between read only Lists
        * from Arrays is that in Arrays on can change elements but can not increase the size.
        * On the other hand, in mutable List and Arrays, one can add, delete and
        * change items of the same type when seems fit thereby changing the size*/

        // some mutable list are as follows
        var delicacies = arrayListOf<String>("Chinese", "India", "African", "European")
        delicacies.add("American")
        println(delicacies)

        // some read-only type of list is given below
        // with this type of array I can not remove but
        // change the item without increasing the array
        var seasonsOfTheYear = arrayOf("Autumn", "Winter", "Summer", "Spring")
        println(seasonsOfTheYear)

        // change the value
        seasonsOfTheYear[2] = "Unknown"
        println(seasonsOfTheYear)

    }
}