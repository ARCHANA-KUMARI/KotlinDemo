package com.example.kotlindemo.collection.map.list.set

fun main() {
    val immutableSet = setOf(6, 9, 9, 0, 0)
    for (item in immutableSet) {
        println(item)
    }
    immutableSet.forEach { println(it) }

}
