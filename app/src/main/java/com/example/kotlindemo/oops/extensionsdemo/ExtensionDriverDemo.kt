package com.example.kotlindemo.oops.extensionsdemo

/**
 *  This class demonstrate the extensions function poc
 *  MutableList doesn`t have swap method so swap functionality created using Extensions function
 *  this: represnts MutableList class.
 *
 *  @Author: Archana Kumari
 *  @Date: 03-12-2022
 */

fun main(args: Array<String>) {
/*    // Extension from Predefined class
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println("list after swapping:" + list)*/

 /*  // Extensions funtion from Userdefined class. Extensino funtion doesn`t follow inheritance concept
    printClassName(Shape())
    printClassName(Rectangle())*/

    // In case class have same function name, params,receiver type. Member funtion method will be called.

    var extensionsFunOverloading = ExtensionsFunOverloading()
    extensionsFunOverloading.printFunctionType()
    // Extension method overloading concept
    extensionsFunOverloading.printFunctionType(10)
}

fun ExtensionsFunOverloading.printFunctionType(i : Int){
    println("Function from extensions"+ i)
}
fun ExtensionsFunOverloading.printFunctionType() {
    println("Function from extensions")
}

fun Shape.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"

// Extension from Userdefined class
fun printClassName(shape : Shape){
    println("Class Name:" + shape.getName())
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    // this represents current list; i.e. list
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp;
}

