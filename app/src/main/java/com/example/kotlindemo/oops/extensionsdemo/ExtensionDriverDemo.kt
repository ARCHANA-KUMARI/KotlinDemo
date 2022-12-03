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
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println("list after swapping:" + list)
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    // this represents current list; i.e. list
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp;
}

