package com.github.mikegehard

fun main(args: Array<String>) {
    var word = getWord()

    while (length(word) <= 0){
        word = getWord()
    }

    println("$word has ${length(word)} characters.")
}

fun getWord(): String? {
    print("What is the input string? ")
    return readLine()
}

fun length(word: String?): Int = word?.length ?: 0
