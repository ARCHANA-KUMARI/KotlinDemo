package com.example.kotlindemo.concept

fun main() {
    val person = Person()
    person.name = "John Doe"
    person.age = 30

    println("Name: ${person.name}")
    println("Age: ${person.age}")

    // Uncommenting the following line will throw an exception
    person.age = -5
}

class Person {
    var name: String = ""
        get() = field
        set(value) {
            println(" set name value = ${value}")
            field = value
        }

    var age: Int = 0
        get() = field
        set(value) {
            println(" set age value = ${value}")
            if (value >= 0) {
                field = value
            } else {
                throw IllegalArgumentException("Age cannot be negative")
            }
        }
}