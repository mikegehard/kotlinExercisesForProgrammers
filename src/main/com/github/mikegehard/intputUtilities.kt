package com.github.mikegehard

fun getNumber(prompt: String): Int {
    fun invalid(number: Int?): Boolean = number == null || number < 0

    var number: Int?
    do {
        print("$prompt ")
        number = try {
            readLine()?.toInt()
        } catch(e: NumberFormatException) {
            null
        }

    } while (invalid(number))

    return number ?: 0
}
