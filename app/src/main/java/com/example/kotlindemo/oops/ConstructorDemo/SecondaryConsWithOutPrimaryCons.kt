package com.example.kotlindemo.oops.ConstructorDemo

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */
class
SecondaryConsWithOutPrimaryCons {
    init{
        println("Init Block will execute first")
    }

    constructor(i : Int){
        println("Secondary Constructor $i")
    }
}