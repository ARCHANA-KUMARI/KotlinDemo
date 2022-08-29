package com.example.kotlindemo.oops

class PersonPrimaryCons constructor(name: String = "Wil", age: Int = 0, salary: Int = 0){
    init {
        println("Welcome to init block")
        println("Name is " + name)
        println("Age is " + age)
        println("Salary is " + salary)
    }
}