package com.example.kotlindemo.channeldemo

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun channelDeom() = runBlocking {
    val channel = Channel<Int>()

    launch {
        repeat(5) {
            channel.send(it)
            println("Sent: $it")
        }
        channel.close()
    }

    launch {
        for (value in channel) {
            println("Received: $value")
        }
    }
}

fun main() {
    channelDeom()
}