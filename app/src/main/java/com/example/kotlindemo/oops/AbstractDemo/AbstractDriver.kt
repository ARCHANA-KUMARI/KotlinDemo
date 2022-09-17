package com.example.kotlindemo.oops.AbstractDemo

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */

fun main(array: Array<String>){
    /*// Simple Abstract Demo
    var rect = Rectangle()
    rect.draw()*/

   /* // Abstract class can override non-abstract method with abstract one.
    var nonAbstract = NonAbstract()
    nonAbstract.display()*/
    // Child class of "Abstract class can override non-abstract method with abstract one"
    var nonOverrideOpenChildMethodDemo = NonOverrideOpenChildMethodDemo();
    nonOverrideOpenChildMethodDemo.display()

}
