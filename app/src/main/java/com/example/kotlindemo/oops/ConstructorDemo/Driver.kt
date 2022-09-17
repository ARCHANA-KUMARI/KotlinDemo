package com.example.kotlindemo.oops

import com.example.kotlindemo.oops.ConstructorDemo.SecondaryCons
import com.example.kotlindemo.oops.ConstructorDemo.SecondaryConsWithOutPrimaryCons

fun main(args: Array<String>){
   /* // Primary Constructor Demo
    val person1 = PersonPrimaryCons("Annonymous" , 20, 5000)
    val person2 = PersonPrimaryCons("Peter")
    val person3 = PersonPrimaryCons()*/

 /*   // Secondary Constructor Demo
    val student = SecondaryCons("Peter", 1)*/

    // Secondary Constructor without Primary Constructor
    var secondaryConsWithPrimaryCons = SecondaryConsWithOutPrimaryCons(10);
}