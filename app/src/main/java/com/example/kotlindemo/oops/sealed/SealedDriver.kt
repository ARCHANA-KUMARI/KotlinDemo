package com.example.kotlindemo.oops.sealed

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */

fun main(array: Array<String>) {
    /*
      Cannot access '<init>': it is protected in 'SealedSuperDemo'
      Sealed types cannot be instantiate
    * */
    // var sealedObj = SealedSuperDemo()

    // Child of Sealed Abstract with abstract method demo
     ChildSealedAbstract().display()
}
