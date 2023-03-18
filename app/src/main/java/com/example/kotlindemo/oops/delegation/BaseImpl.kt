package com.example.kotlindemo.oops.delegation

/** This clas demonstrate the delegation pattern in kotlin
 * @Author: Archana Kumari
 * @Date: 18-03-2023
 */
class BaseImpl(private val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b

fun main() {
    val base = BaseImpl(10)
    Derived(base).print()
}