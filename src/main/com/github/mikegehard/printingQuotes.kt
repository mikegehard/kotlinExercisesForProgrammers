package com.github.mikegehard

fun main(args: Array<String>) {
    print("What is the quote? ")
    val quote = readLine()
    print("Who said it? ")
    val person = readLine()

    println("$person says, \"$quote\"")
}