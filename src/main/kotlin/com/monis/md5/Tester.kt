package com.monis.md5

import java.math.BigInteger
import java.security.MessageDigest

fun main(args: Array<String>) {
    val passwd = "123456"
    println(passwd.md5())

    //---------------------------------

  /*  //Android Studio Kotlin LoginActivity 內容
    val sEmail = mail.text.toString()
    val sPassword = password.text.toString()
    val passwordMd5 = toMD5(sPassword)
    //修改成
    sPassword.md5()*/

    /*//用 Kotlin 將字串轉成 MD5 雜湊碼當成密碼... md5 將密碼轉成16 個 byte字元
    val passwd = "123456"
    val md5 = MessageDigest.getInstance("MD5")
    //只是印出物件,不是內容
    println(md5.digest(passwd.toByteArray()))

    val bigi = BigInteger(1, md5.digest(passwd.toByteArray()))
    //補足32個字元 ,不足則前面補 0
    println(bigi.toString(16).padStart(32, '0'))
    println("123456".padStart(32,'0'))*/
}

fun toMD5(str: String): String {
    val md5 = MessageDigest.getInstance("MD5")
    val bigi = BigInteger(1, md5.digest(str.toByteArray()))
    return bigi.toString(16).padStart(32,'0')
}