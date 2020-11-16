package com.example.myclassesexer

class Car (make: String, model: String, year: Int, weight: Int, var isDriving: Boolean): Vehicle(make, model, year, weight) {

    // declare the functions
    fun drive(){
     this.isDriving = true
     }

    fun stop(){
        this.isDriving = false
        this.tripsSinceMaintenance ++
        if(this.tripsSinceMaintenance > 100){
            this.needsMaintenance = true
        }
    }

    fun repair(){
        this.needsMaintenance = false
        this.tripsSinceMaintenance = 0
    }

}