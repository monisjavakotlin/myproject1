package com.monis

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
//    method1()
//    method2()
//    method3()
    val url = URL("https://atm201605.appspot.com/h")
//    val url = URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    println(url.readText())

}

private fun method3() {
    val url = URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }
}

private fun method2() {
    val url =
        URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader()
        var line = br.readLine()
        val sb = StringBuffer()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
        }
        println(sb.toString())
    }
}

private fun method1() {
    val url =
        URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val sb = StringBuffer()
    while (line != null) {
        sb.append(line)
        line = br.readLine()
    }
    println(sb.toString())
}