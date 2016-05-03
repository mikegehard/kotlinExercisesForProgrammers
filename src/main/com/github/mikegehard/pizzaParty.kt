package com.github.mikegehard

fun main(args: Array<String>) {
    val people = getNumber("How many people?")
    val pizzas = getNumber("How many pizzas?")
    val piecesPerPizza = getNumber("How many pieces per pizza?")

    val totalPieces = pizzas * piecesPerPizza
    val piecesPerPerson = totalPieces / people
    val leftover = totalPieces.mod(people)

    println("$people people with $pizzas pizzas")
    println("Each person gets ${piecesOfPizza(piecesPerPerson)} of pizza.")
    println("There ${leftoverPieces(leftover)}")
}

fun piecesOfPizza(number: Int): String = "$number ${pluralizePiece(number)}"


fun leftoverPieces(number: Int): String = "${isOrAre(number)} $number leftover ${pluralizePiece(number)}."

private fun pluralizePiece(number: Int): String {
    return if (number == 1)
        "piece"
    else
        "pieces"
}

private fun isOrAre(number: Int): String {
    return if (number == 1)
        "is"
    else
        "are"
}
