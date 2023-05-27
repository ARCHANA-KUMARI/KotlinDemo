package com.example.kotlindemo.concept

/** This clas demonstrate the behaviour of utility function of kotlin
 *  apply, let, with, run
 * @Author: Archana Kumari
 * @Date: 27-03-2023
 */
fun main(args: Array<String>) {
    val emp = Employee()
    emp.name = "Peter"
    emp.age = 10
    println("Employee is : " + emp)

    // Assign property of object without using object.
    emp.apply {
        name = "Aisha"
        age = 30
    }
    println("Employee is : " + emp)

    // Print class properties without object. and let return value is last statement of let return value
    var empReturn = emp.let {
        println(it.name)
        println(it.age) // return value Unit
    }
    println("empReturn" + empReturn)

    val empNull: Employee? = null
     empNull?.let {
         it.age = 40
         it.name = "Lucca Queen"
     }
     println("empNull" + empNull)

    var withReturn = with(emp) {
        age = 30
        name = "Sharma" // withReturn is last statement of with block/
    }
    println("WithReturn:" + withReturn)

    var withReturnRun = emp.run {

        age = 31
        name = "Singh"
        2// withReturn is last statement of with block/
    }
    println("withReturnRun:" + withReturnRun)
}

data class Employee(var name: String = "", var age: Int = 0)