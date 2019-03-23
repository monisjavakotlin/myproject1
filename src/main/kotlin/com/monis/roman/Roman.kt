package com.monis.roman

fun main(args: Array<String>) {
    val bases = arrayListOf<Int>(1000, 500, 100, 50, 10, 5, 1)
    val roman = mapOf<Int, String>(
        1000 to "M", 500 to "D", 100 to "C", 50 to "L",
        10 to "X", 5 to "V", 1 to "I"
    )
    for(k in 1..99) {
        var n = k
        print("$k ")
        bases.forEachIndexed { i, b ->
            val q = n / b
            val r = n % b
            val str = roman.get(b)
            var pass = false
            var res = when {
                q == 1 && r == 4 -> {
                    pass = true
                    ""
                }
                q < 4 && q > 0 -> str?.repeat(q)
                q == 4 -> "$str${roman.get(bases.get(i - 1))}"
                q > 5 && q < 9 -> "${roman.get(bases.get(i - 1))}${str?.repeat(q - 5)}"
                q == 9 -> "$str${roman.get(bases.get(i - 2))}"
                else -> ""
            }
            print(res)
            if(!pass) n %= b
        }
        println()
    }
}