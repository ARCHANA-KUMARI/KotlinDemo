package com.example.kotlindemo.collection.map.list

fun main() {
    val mutableList = mutableListOf("Raj", "Ram", "Sita")
    mutableList[0] = "Laxman"
    mutableList.add("Ravan")

    for (item in mutableList) {
        println(item)
    }
}