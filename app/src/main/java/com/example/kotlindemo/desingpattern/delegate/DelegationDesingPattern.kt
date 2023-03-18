package com.example.kotlindemo.desingpattern.delegate

/**
 * @Author: Archana Kumari
 * @Date: 18-03-2023
 */
class DelegationDesingPattern(
    private val downloadManager: IDownloadManager,
    private val playManager: IPlayer
) : IDownloadManager, IPlayer {
    override fun dowload() {
        downloadManager.dowload()
    }

    override fun play() {
        playManager.play()
    }
}

class FileDownload(private val fileName: String) : IDownloadManager {
    override fun dowload() {
        println("$fileName" + "In FileDownlaod")
    }
}

class FilePlayer(private val playerName: String) : IPlayer {
    override fun play() {
        println("$playerName" + "Player Name")
    }
}

fun main(args : Array<String>) {
  val designPattern =  DelegationDesingPattern(FileDownload("Android.mk File"),FilePlayer("Google Android Video") )
  designPattern.dowload()
  designPattern.play()

}