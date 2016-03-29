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
    print(prompt)
    return readLine()?.toInt() ?: 0
}
