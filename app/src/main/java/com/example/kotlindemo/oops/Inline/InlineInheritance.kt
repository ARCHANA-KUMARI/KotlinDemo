package com.example.kotlindemo.oops.Inline

/** 1. Inline class primary constructor property should be final only
 *  2.
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
@JvmInline
value class InlineInheritance(val s : String) : IPrintable{
    override fun print(): String = "Let`s $s!"

}