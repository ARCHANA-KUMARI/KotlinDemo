package com.example.kotlindemo.collection.map

fun main() {
    val immutableMap = mapOf(1 to "Ram", 2 to "Raj", 3 to "Sita")
    immutableMap.forEach { (key, value) ->
        println("$key: $value")
    }
}