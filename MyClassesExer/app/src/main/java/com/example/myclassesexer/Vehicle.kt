package com.example.myclassesexer

open class Vehicle (var make: String, var model: String, var year: Int, var weight: Int){
    var needsMaintenance: Boolean = false
    var tripsSinceMaintenance: Int = 0

    fun setVehicleMake(getMake: String){
        this.make = getMake
    }

    fun setVehicleModel(getModel: String){
        this.model = getModel
    }

    fun setVehicleYear(getYear: Int){
        this.year = getYear
    }
    fun setVehicleWeight(getWeight: Int){
        this.weight = getWeight
    }
}