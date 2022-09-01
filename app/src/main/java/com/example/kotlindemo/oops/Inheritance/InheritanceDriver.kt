package com.example.kotlindemo.oops.Inheritance

   fun main(args: Array<String>){
      /*  var circle = Circle();
        circle.draw()
       var rectangle = Rectangle()
       rectangle.draw()

       // Overriding properties demo
       var overridingPropertiesChild = OverridingPropertiesChild();
       print("overriding val in child" + overridingPropertiesChild.vertexCount)
       print("overriding val in child using ctor" + overridingPropertiesChild.handCount)*/

     /*  //Init order of child and super class
       ChildInitOrder("Hi", "Hello")*/

       //Access super method and property impl in child class using super keyword

       val child = ChildAccessSuperImpl()
       child.superMethod()
       print("Property in child class from super class" + child.childProperty )
    }
