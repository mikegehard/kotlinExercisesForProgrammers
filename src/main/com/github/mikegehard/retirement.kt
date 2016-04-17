package com.github.mikegehard

import java.time.LocalDate

fun main(args: Array<String>) {
    val currentAge = getNumber("What is your current age?")
    val retirementAge = getNumber("What age would you like to retire?")
    val currentYear = LocalDate.now().year
    val yearsToRetirement = retirementAge - currentAge

    println("You have $yearsToRetirement until you retire")
    println("It's $currentYear, so you can retire in ${currentYear + yearsToRetirement}")

}
