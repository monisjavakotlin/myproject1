package com.monis.roman

fun main(args: Array<String>) {
    val roman = mapOf<Int, String>(
        1000 to "M", 500 to "D", 100 to "C", 50 to "L",
        10 to "X", 5 to "V", 1 to "I"
    )
    for(k in 1..99) {
        var n = k
        print("$k ")
        roman.toSortedMap(compareByDescending { it })
            .filter { it.key.toString().startsWith("1") }
            .forEach { b, v ->
                val q = n / b
                var res = when {
                    q in 1..3 -> roman[b]?.repeat(q)
                    q == 4 -> roman[b] + roman[b*5]
                    q == 5 -> roman[b*5]
                    q in 6..8 -> roman[b*5] + roman[b]?.repeat(q-5)
                    q == 9 -> roman[b] + roman[b*10]
                    else -> ""
                }
                print(res)
                n %= b
            }
        println()
    }
}