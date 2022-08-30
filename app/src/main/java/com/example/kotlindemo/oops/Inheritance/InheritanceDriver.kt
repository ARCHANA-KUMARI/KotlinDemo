package com.example.kotlindemo.oops.Inheritance

   fun main(args: Array<String>){
        var circle = Circle();
        circle.draw()
       var rectangle = Rectangle()
       rectangle.draw()

       // Overriding properties demo
       var overridingPropertiesChild = OverridingPropertiesChild();
       print("overriding val in child" + overridingPropertiesChild.vertexCount)
    }
