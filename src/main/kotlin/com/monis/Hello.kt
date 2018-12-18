package com.monis

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    val age : Int = 19
    var weight = 66.5
    var height = 1.7f
    var name : String
    name = "monis"
}

class Human{
    fun hello() {
        println("Hello Kotlin")
    }
}