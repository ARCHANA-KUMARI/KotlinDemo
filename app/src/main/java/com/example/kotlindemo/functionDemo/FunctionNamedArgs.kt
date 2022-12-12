package com.example.kotlindemo.functionDemo

/**
 * This class demonstrate behaviour of Named arguments for function
 * @Author: Archana Kumari
 * @Date: 12-12-2022
 */
class FunctionNamedArgs {
    fun reformat(
        str: String,
        normalizeCase: Boolean = true,
        upperCaseFirstLetter: Boolean = true,
        divideByCamelHumps: Boolean = false,
        wordSeparator: Char = ' ',
    ) {
        println("String is" + str)
        println("normalizeCase is" + normalizeCase)
        println("upperCaseFirstLetter is" + upperCaseFirstLetter)
        println("divideByCamelHumps is" + divideByCamelHumps)
        println("wordSeparator is" + wordSeparator)
    }
}