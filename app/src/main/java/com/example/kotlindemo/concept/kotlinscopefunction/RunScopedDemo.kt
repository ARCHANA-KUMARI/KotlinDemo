package com.example.kotlindemo.concept.kotlinscopefunction

import android.location.Location

fun main() {
    println("result = ${result}")

    val location = Location()
    location.run {
        latitude = 12.9716 // here we don't need to use location.latitude, we can directly use latitude
        longitude = 77.5946
        println("Lat: $latitude, Lng: $longitude")
    }

    println("description = ${location}")
}
val result = run {
    val a = 5
    val b = 10
    a + b
}



 class Location(var latitude: Double = 0.0, var longitude: Double = 0.0)