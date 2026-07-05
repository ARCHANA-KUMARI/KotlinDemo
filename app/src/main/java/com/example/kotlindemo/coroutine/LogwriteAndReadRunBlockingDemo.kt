package com.example.kotlindemo.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() = runBlocking {
    val logFile = File("kotlin_demo.txt")
    // Write logs to file
    writeLogs(
        logFile, listOf(
            "INFO: App started",
            "DEBUG: User clicked button",
            "ERROR: NullPointerException at MainActivity",
            "INFO: App closed"
        )
    )
    println("Logs written to ${logFile.absolutePath}")

    // Read logs back
    val logs = readLogs(logFile)
    println("Total log entries: ${logs.size}")
    logs.forEach { println(it) }
}

suspend fun readLogs(file: File): List<String> {
    delay(200) // simulate async work
    return file.readLines()
}

suspend fun writeLogs(file: File, entries: List<String>) {
    delay(200) // simulate async work
    file.printWriter().use { out ->
        entries.forEach { out.println(it) }
    }
}

