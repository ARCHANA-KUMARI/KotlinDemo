package com.example.kotlindemo.oops.datademo

/**
 * @Author: Archana Kumari
 * @Date: 04-09-2022
 */
fun main(args : Array<String>){
    // Check basic toString(), hashCode
    var dataDemo = DataDemo("abcTest", 6 )
    var dataDemo1 = DataDemo("abcTest", 6 )
    // Data class compare object by using content in both case equals and ==
    println("DataDemo object equals Method check" + dataDemo.equals(dataDemo1))
    println("DataDemo object == operator check" + (dataDemo == dataDemo1))
    println("DataDemo object hashCode Method check" + dataDemo.hashCode()) // same hashcode of dataDemo1
    println("DataDemo1 object hashCode Method check" + dataDemo1.hashCode()) // same hashcode of dataDemo

    var dataDemo2 = DataDemo("abcTest", 7 )
    println("DataDemo object equals Method check false demo" + dataDemo.equals(dataDemo2))
    println("DataDemo object == operator check false demo" + (dataDemo == dataDemo2))

    println("DataDemo object" + dataDemo)
    println("DataDemo toString" + dataDemo.toString())
    println("DataDemo hashCode" + dataDemo.hashCode())
    //var dataDemoCopyOf = dataDemo.copy()
    var dataDemoCopyOf = dataDemo.copy("xyzTest", 6)


    println("DataDemo componentN" + dataDemoCopyOf)

   /* // Demo for properties which is not defined in primary constructor
    var dataDemoMis = DataDemoMis("DevK")
    println("DataDemoMis object" + dataDemoMis)
    println("DataDemoMis toString" + dataDemoMis.toString())
    println("DataDemoMis hashCode" + dataDemoMis.hashCode())*/
}