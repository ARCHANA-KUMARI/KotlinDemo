package com.example.kotlindemo.oops.EnumDemo

/**
 * @Author: Archana Kumari
 * @Date: 21-09-2022
 */
fun main(args : Array<String>){
    println("Enum Instance order is based on instance declaration in enum class:")
    println("1" + EnumDemo.NORTH + "Name :" + EnumDemo.NORTH.name + "Val :" +  EnumDemo.NORTH.ordinal)
    println("2" + EnumDemo.SOUTH + "Name :" + EnumDemo.SOUTH.name + "Val : " + EnumDemo.SOUTH.ordinal)
    println("3" + EnumDemo.WEST + "Name:" + EnumDemo.WEST.name + "Val:" + EnumDemo.WEST.ordinal)
    println("4" + EnumDemo.EAST + "NAME:" + EnumDemo.EAST.name + "Val:" + EnumDemo.EAST.ordinal)
}