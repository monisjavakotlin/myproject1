package com.monis.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    Studentkt.pass = 50
    val stu = Studentkt("snow",60,99)
    val stu2 = Studentkt("monis",44,68)
    val stu3 = Studentkt("lulu",30,49)
    val gstu = GraduateStudentkt("maxx",55,65,60)
    gstu.printkt()
    stu.printkt()
    stu2.printkt()
    stu3.printkt()
    println("High score : ${stu.highest()}")
    val test = 123
    println("Test is : $test")
}

class GraduateStudentkt(name: String?,english: Int,math: Int,var thesis: Int) : Studentkt(name,english,math){
    companion object {
        var pass = 70
    }

    override fun printkt() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Studentkt(var name: String?, var english: Int, var math: Int){
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }

    open fun printkt(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")

//        print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + passOrFailed())
//        println("\t" + grading())
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FILED"

    fun grading() = when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }

    fun getAverage() = (english+math)/2

    fun highest(): Int {
//        var max = if(english > math) english else math

    /*    var max = 0;
        if(english > math){
            max = english
        }else{
            max = math
        }*/
        return if(english > math) english else math
    }

    fun nameCheck() {
        println(name?.length)
    }

    private fun userInput() {
        val scanner = Scanner(System.`in`)
        print("Please enter student's name : ")
//    var name = scanner.next()
        var name = null
        print("Please enter student's english : ")
        var english = scanner.nextInt()
        print("Please enter student's math : ")
        var math = scanner.nextInt()
        val stu = Studentkt(name, english, math)
        stu.printkt()
        stu.nameCheck()
    }
}