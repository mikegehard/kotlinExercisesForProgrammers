package com.github.mikegehard

fun main(args: Array<String>) {
    print("What is the input string? ")
    val word = readLine()
    val numberOfCharacters = word?.length ?: 0
    println("$word has $numberOfCharacters characters.")

}
