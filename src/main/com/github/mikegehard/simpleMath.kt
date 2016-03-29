package com.github.mikegehard

fun main(args: Array<String>) {
    val firstNumber: Int = getNumber("What is the first number? ")
    val secondNumber: Int = getNumber("What is the second number? ")

    println("""
$firstNumber + $secondNumber = ${firstNumber + secondNumber}
$firstNumber - $secondNumber = ${firstNumber - secondNumber}
$firstNumber * $secondNumber = ${firstNumber * secondNumber}
$firstNumber / $secondNumber = ${firstNumber / secondNumber}
    """)
}

fun getNumber(prompt: String): Int {
    var number: Int?
    do {
        print(prompt)
        number = try {
            readLine()?.toInt()
        } catch(e: NumberFormatException) {
            null
        }

    } while (number == null)

    return number
}
