package com.monis.md5

import java.math.BigInteger
import java.security.MessageDigest

fun String.md5(): String {
    val md5 = MessageDigest.getInstance("MD5")
    val bigi = BigInteger(1, md5.digest(this.toByteArray()))
    return bigi.toString(16).padStart(32,'0')
}