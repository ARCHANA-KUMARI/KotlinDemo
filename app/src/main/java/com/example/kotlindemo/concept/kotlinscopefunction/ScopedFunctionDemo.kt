package com.example.kotlindemo.concept.kotlinscopefunction

fun main() {
 /*   var letVariable = Person("ABC", 20).let {
    }
    //println("letVariable = ${letVariable}") // op letVariable = kotlin.Unit
    var runVariable = Person("ABC", 20).run { }
  //  println("runVariable = ${runVariable}") //op runVariable = kotlin.Unit
    var withVariable = with(Person("ABC", 20)) {}
   // println("withVariable = ${withVariable}")  //withVariable = kotlin.Unit
    var applyVariable = Person("ABC", 20).apply { }
   // println("applyVariable = ${applyVariable}") //applyVariable = Person(name=ABC, age=20)
    var alsoVariable = Person("ABC", 20).also { }
   // println("alsoVariable = ${alsoVariable}") //alsoVariable = Person(name=ABC, age=20)*/

    var letVariable = Person("ABC", 20).let {
        it.name + it.age
    }
    println("letVariable = ${letVariable}") // op letVariable = kotlin.Unit
    var runVariable = Person("ABC", 20).run { this.name + this.age }
    println("runVariable = ${runVariable}") //op runVariable = kotlin.Unit
    var withVariable = with(Person("ABC", 20)) {
        this.name + this.age
    }
    println("withVariable = ${withVariable}")  //withVariable = kotlin.Unit
    var applyVariable = Person("ABC", 20).apply {
        this.name + this.age
    }
    println("applyVariable = ${applyVariable}") //applyVariable = Person(name=ABC, age=20)
    var alsoVariable = Person("ABC", 20).also {
        it.name + it.age
    }
    println("alsoVariable = ${alsoVariable}") //alsoVariable = Person(name=ABC, age=20)


}

