package com.example.kotlindemo.oops.extensionsdemo

import com.example.kotlindemo.functionDemo.sum
import com.example.kotlindemo.oops.objExpAndDecDemo.CompanianObjDemo

fun List<String>.getLongestString(list: MutableList<String>): String {
    var maxLength = list[0].length
    var index: Int
    index = 0;

    for (item: String in list) {
        if (maxLength < item.length) {
            maxLength = item.length
            index = list.indexOf(item)
        }
    }
    return list[index];
}

/**
 *  This class demonstrate the extensions function poc for all usecase
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

   /* // In case class have same function name, params,receiver type. Member funtion method will be called.

    var extensionsFunOverloading = ExtensionsFunOverloading()
    extensionsFunOverloading.printFunctionType()
    // Extension method overloading concept
    extensionsFunOverloading.printFunctionType(10)*/

/*    // Extensions function demo for companion object
    println("Companion sum:" + sum(10, 15))*/

  /*  // Scope of extension function test
   var  list = mutableListOf(
        "Alisha",
        "Peter Floric",
        "Diana",
        "Willgarner",
        "Cerry Algos"
    )
    println("Longest Length string is:" + list.getLongestString(list))*/

    // Declaring extension as a member
    Connection(Host("kotl.in"), 443).connect()
}

fun CompanianObjDemo.Companion.sum(num: Int, num1: Int): Int {
    return num + num1
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

