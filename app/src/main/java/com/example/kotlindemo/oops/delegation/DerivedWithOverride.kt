package com.example.kotlindemo.oops.delegation

/** This class demonstrate behaviour of delegation over ovveride method.
 *
 * @Author: Archana Kumari
 * @Date: 18-03-2023
 */
class DerivedWithOverride(private val base: Base) : Base by base {
    override fun print() {
        println("I am in print of DerivedWithOverride")
    }
}

fun main() {
    val base = BaseImpl(24)
    DerivedWithOverride(base).print()
}