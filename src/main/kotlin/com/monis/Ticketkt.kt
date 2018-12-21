package com.monis

import java.util.*

data class Ticketkt(val origin: Int, val destination: Int, val price: Int)

fun main(args: Array<String>) {
    var ticket = Ticketkt(20,51,420)
    val s = "abcde"
    println(s.validate())
    // two method to generate random number(kotlin & java)

    //kotlin
    println((1..10).random())

    //java
    var r = Random().nextInt(10) + 1
    println(r)
}

fun String.validate() :Boolean {
    return this.length > 6
}

fun IntRange.random() : Int {
    val r = Random().nextInt(endInclusive - start) + start
    return r
}