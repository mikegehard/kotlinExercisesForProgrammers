package com.github.mikegehard

fun main(args: Array<String>) {
    val firstNumber: Int = getNumber("What is the first positive number? ")
    val secondNumber: Int = getNumber("What is the second positive number? ")

    println("""
$firstNumber + $secondNumber = ${firstNumber + secondNumber}
$firstNumber - $secondNumber = ${firstNumber - secondNumber}
$firstNumber * $secondNumber = ${firstNumber * secondNumber}
$firstNumber / $secondNumber = ${firstNumber.toFloat() / secondNumber}
    """)
}

fun getNumber(prompt: String): Int {
    fun invalid(number: Int?): Boolean = number == null || number < 0

    var number: Int?
    do {
        print(prompt)
        number = try {
            readLine()?.toInt()
        } catch(e: NumberFormatException) {
            null
        }

    } while (invalid(number))

    return number ?: 0
}
