package com.example.kotlindemo.oops.Inheritance

/**
 * @Author: Archana Kumari
 * @Date: 30-08-2022
 */
class OverridingPropertiesChild(override val handCount: Int = 10) : OverridingPropertiesSuper( ){
     override val vertexCount = 4
    // or
   /* override var vertexCount = 4*/
}