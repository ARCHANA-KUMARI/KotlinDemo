package com.example.kotlindemo.collection.map.set

fun main() {
    val mutableSet = mutableSetOf(6, 9, 0)
    mutableSet.add(3)
    mutableSet.remove(9)

    for (item in mutableSet) {
        println(item)
    }
}