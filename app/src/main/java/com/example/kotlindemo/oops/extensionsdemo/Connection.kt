package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 04-12-2022
 */

class Connection(val host: Host, val port: Int) {
    fun printPort() {
        print(port)
    }

    fun Host.printConnectionString() {
        host.printHostName()
        print(":")
        printPort()
    }

    fun connect(){
        host.printConnectionString()
    }
}


