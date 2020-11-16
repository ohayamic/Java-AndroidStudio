package com.example.myclassesexer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1: Car = Car("Volks Wagen", "X-Class", 2020, 2000, false)
        val car2: Car = Car("BMW", "J-Wagon", 2016, 1800, false)
        val car3: Car = Car("Mercedes", "X-Class", 2002, 1000, false)

        // Loop through the sequence while running the objects
        for (i in 0..100){
            // Drive car1 for 100 times
            car1.drive()
            car1.stop()

            // Drive car2 for 100 times
            car2.drive()
            car2.stop()
            if (!car2.isDriving ){
                car2.drive()
                car2.needsMaintenance = false
            }else{
                car2.repair()
                car2.needsMaintenance = true
            }

            car3.drive()
            car3.stop()
        }

        // print details of the car object
        println("")
        println("${car1.make}, ${car1.model}, ${car1.year}, ${car1.weight}, ${car1.needsMaintenance}, ${car1.tripsSinceMaintenance}")
        println("${car2.make}, ${car2.model}, ${car2.year}, ${car2.weight}, ${car2.needsMaintenance}")
        println("${car3.make}, ${car3.model}, ${car3.year}, ${car3.weight}, ${car3.needsMaintenance}")


        // Set the value of the cars
        car1.setVehicleMake("G-Wagon")
        println("${car1.make}, ${car1.model}, ${car1.year}, ${car1.weight}, ${car1.needsMaintenance}, ${car1.tripsSinceMaintenance}")

    }
}