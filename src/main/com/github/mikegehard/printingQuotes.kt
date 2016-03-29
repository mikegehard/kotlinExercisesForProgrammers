package com.github.mikegehard

fun main(args: Array<String>) {
    val quotes = listOf(
            Pair("Ob-Wan Kenobi", "These aren't the droids you're looking for.")
    )

    quotes.forEach { println("${it.first} says, \"${it.second}\"") }
}