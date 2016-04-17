package com.github.mikegehard

fun main(args: Array<String>) {
    val firstNumber: Int = getNumber("What is the first positive number?")
    val secondNumber: Int = getNumber("What is the second positive number?")

    println("""
$firstNumber + $secondNumber = ${firstNumber + secondNumber}
$firstNumber - $secondNumber = ${firstNumber - secondNumber}
$firstNumber * $secondNumber = ${firstNumber * secondNumber}
$firstNumber / $secondNumber = ${firstNumber.toFloat() / secondNumber}
    """)
}
