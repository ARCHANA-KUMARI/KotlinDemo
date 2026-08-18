package com.example.kotlindemo.concept.visibilitymodifiers

fun main() {
    val o = Outer()
    // o.a, o.b are not visible
    o.c and o.d //are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either

    val s = Subclass()
    // s.a is not visible
    // s.b, s.c and s.d are visible
    // Outer.Nested is not visible, and Nested::e is not visible either
}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    //  a //is not visible
    //b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(val o: Outer) {
    fun set() {
        o.d // is visible
        o.c // is visible (same module)
        // o.b is not visible
    }
}

