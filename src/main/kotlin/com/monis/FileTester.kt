package com.monis

import java.io.File

fun main(args: Array<String>) {
//    File("output.txt").writeText("abc123")
//    write()
    read()
}

private fun read() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3nd line")
    }

    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}