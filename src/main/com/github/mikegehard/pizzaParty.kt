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

fun piecesOfPizza(number: Int): String = "$number ${"piece".pluralize(number)}"


fun leftoverPieces(number: Int): String = "${number.isOrAre()} $number leftover ${"piece".pluralize(number)}."

private fun String.pluralize(number:Int): String{
    return if (number == 1)
        this
    else
        "${this}s"
}

private fun Int.isOrAre(): String {
    return if (this == 1)
        "is"
    else
        "are"
}
