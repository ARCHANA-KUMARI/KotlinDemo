package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
fun main() {
    /*// Member
    val name = InlineMemberDemo("Kotlin")
    name.greet()
    println(name.length)*/

   /* // Inheritance with Inline class
    var name = InlineInheritance("Kotlin Demo")
    println(name.print())*/

    // Inline Representation demo

   /* val inn = InlineRepresentation(42)
    asGeneric(inn)
    asInline(inn)
    asInterface(inn)
    asNullable(inn)
    println(id(inn))*/

    // Alias Vs Inline Demo

    val nAlias : nameTypeAlias = ""
    val nInline : InlineVsAliasDemo = InlineVsAliasDemo("")
    val nString : String = ""

    asseptString(nAlias)
    // asseptString(nInline) /* Not Okay required String found Alias */
    asseptNameTypeAlias(nAlias)
   // asseptNameInlineClass(nString) // Not Okay required Inline found String
}