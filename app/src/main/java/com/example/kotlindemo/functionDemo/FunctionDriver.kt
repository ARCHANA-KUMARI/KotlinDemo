package com.example.kotlindemo.functionDemo

/**
 * @Author: Archana Kumari
 * @Date: 09-12-2022
 */
fun main(args: Array<String>) {
   /* var functionWithDefArgs = FunctionWithDefArgs()
    // Passing one mandatory param so  rest params will be default passed argument.
    functionWithDefArgs.read(1);

    //With argument
    var functionWithArg = FunctionWithDefArgs()
    // Passing 2 params so remaining default argument will be used.
    functionWithArg.read(2, 49);

    //With argument
    var functionWithAllArg = FunctionWithDefArgs()
    // Passing all params explicitly
    functionWithAllArg.read(3, 50, "Peter Floric");*/

  /*  // Method overriden with default args.
    ChildFunWithDefArgs().read(5)
    ChildFunWithDefArgs().read(6, 16)
    ChildFunWithDefArgs().read(7, 14, "Grace Floric")*/

  /*  // Named argument function call
    var funNamedArgs = FunctionNamedArgs()
    funNamedArgs.reformat("Default string")
    println("Named Argument Demo")
    funNamedArgs.reformat("string test", normalizeCase = false, divideByCamelHumps = false)*/

    // vararg param type
    var funArgs = FunctionVarArgs()
    funArgs.names("Alica", "Florick")
}
