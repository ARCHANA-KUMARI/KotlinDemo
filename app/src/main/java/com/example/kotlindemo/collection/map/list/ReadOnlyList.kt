package com.example.kotlindemo.collection.map.list

fun main() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    val filteredShapes = readOnlyShapes.filter { it.startsWith("tr") }
    println(filteredShapes)
    readOnlyShapes.forEach { println(it) }
    for (shape in readOnlyShapes) {
        println(shape)
    }

    readOnlyShapes.first()
}
