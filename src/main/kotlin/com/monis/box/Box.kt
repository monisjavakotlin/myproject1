package com.monis.box

fun main(args: Array<String>) {
    println("Please enter object's length : ")
    val length = readLine()!!.toFloat()
    println("Please enter object's width : ")
    val width = readLine()!!.toFloat()
    println("Please enter object's heigth : ")
    val heigth = readLine()!!.toFloat()
    println("Yoru object's dimension : $length/$width/$heigth")

    //update 2019/01/22
    val box = Box.fit(length, width, heigth)
    println("${box.name()}(${box.length},${box.width},${box.heigth})")



/*    val box3 = Box3()
    val box5 = Box5()
    if(box3.validate(length,width,heigth)){
        println("Your choice is : ${box3.name()}")
    }else if (box5.validate(length, width, heigth)) {
        println("Your choice is : ${box5.name()}")
    } else {
        println("no match")
    }*/
}

open abstract class Box(val length: Float, val width: Float, val heigth: Float){
    var price = 0
    //update 2019/01/22
    companion object {
        val boxes = mutableListOf<Box>(Box0(),Box5(),Box3())
        fun fit(length: Float, width: Float, heigth: Float): Box {
            boxes.forEach {
                if (it.validate(length, width, heigth)) {
                    return it
                }
            }
            return boxes.get(0)
        }
        init {
            boxes.sortWith(compareBy({it.price}))
            for (box in boxes) {
                println(box.name())
            }
        }
    }

    fun validate(length: Float,width: Float,heigth: Float)
        = length<=this.length && width<=this.width && heigth<=this.heigth
    abstract fun name(): String
}

//update 2019/01/22
class Box0 : Box(0f,0f,0f){
    override fun name(): String{
        return "No box fits"
    }
}

class Box3 : Box(24f,14f,13f){
    init {
        price = 60
    }
    override fun name(): String{
        return "Box3"
    }
}

class Box5 : Box(39.5f,27.5f,23f){
    init {
        price = 90
    }
    override fun name(): String{
        return "Box5"
    }

}