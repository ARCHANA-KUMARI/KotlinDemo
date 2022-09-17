package com.example.kotlindemo.oops.ConstructorDemo

class SecondaryCons(var name: String) {
    init {
       println("Init Block called Student name is:" + name)

    }

    //Secondary constructor
    constructor(sectionName: String, id: Int) : this(sectionName){
        println("Secondary Constructor called")
        println("Student id is:" + id)
    }

}