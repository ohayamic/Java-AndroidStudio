package com.example.myclassesexer

class Plane(make:String, model:String, year:Int, weight:Int):Vehicle(make, model, year, weight) {

    var isDriving: Boolean = false

    fun flying(): Boolean{
        this.isDriving = true
        if (this.needsMaintenance){
            println("You can no longer fly this plane")
            return false
        }
        return true
    }

    fun landing(){
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