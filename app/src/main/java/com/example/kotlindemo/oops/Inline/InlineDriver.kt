package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
fun main() {
    /*// Member
    val name = InlineMemberDemo("Kotlin")
    name.greet()
    println(name.length)*/

   /* // Inheritance with Inline class
    var name = InlineInheritance("Kotlin Demo")
    println(name.print())*/

    // Inline Representation demo

    val inn = InlineRepresentation(42)
    asGeneric(inn)
    asInline(inn)
    asInterface(inn)
    asNullable(inn)
    println(id(inn))

}