package com.github.mikegehard

data class Quote(val person: String, val text: String)

fun main(args: Array<String>) {
    val quotes = listOf(
            Quote("Ob-Wan Kenobi", "These aren't the droids you're looking for.")
    )

    quotes.forEach { println("${it.person} says, \"${it.text}\"") }
}