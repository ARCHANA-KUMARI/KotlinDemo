package com.example.kotlindemo.functionDemo

/**
 * @Author: Archana Kumari
 * @Date: 09-12-2022
 */
fun main(args: Array<String>) {
    var functionWithDefArgs = FunctionWithDefArgs()
    // Passing one mandatory param so  rest params will be default passed argument.
    functionWithDefArgs.read(1);

    //With argument
    var functionWithArg = FunctionWithDefArgs()
    // Passing 2 params so remaining default argument will be used.
    functionWithArg.read(2, 49);

    //With argument
    var functionWithAllArg = FunctionWithDefArgs()
    // Passing all params explicitly
    functionWithAllArg.read(3, 50, "Peter Floric");
}