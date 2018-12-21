package com.monis

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
//    val h = Human().hello()
//    h.hello()
//    val h = Human(66.5f,1.7f)
    val h = Human(weight = 66.5f,height = 1.7f)
    println(h.bmi())
    val score = 88
    println(score >80)
    var c: Char = 'A'
    println(c.toInt() > 60)

    var s : String? = "abcde"
    s = null
//    println(s!!.length)
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))


   /* val age : Int = 19
    var weight = 66.5
    var height = 1.7f
    var name : String
    name = "monis"*/
}

class Human(var name:String = "", var weight:Float,var height:Float){
    init {
        println("test $weight")
    }
//    constructor(name:String,weight:Float,height: Float):this(weight,height)

    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}