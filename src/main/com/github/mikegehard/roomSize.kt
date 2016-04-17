package com.github.mikegehard

import java.math.BigDecimal
import java.math.MathContext

fun main(args: Array<String>) {
    val sqFeetToSqMeters = 0.09290304
    // This will get you 5 digits, not always 3 decimal places.
    val precision = 5

    val length = getNumber("What is the length of room in feet?")
    val width = getNumber("What is the width of room in feet?")
    val areaFeet = length * width
    val areaMeters = BigDecimal(areaFeet * sqFeetToSqMeters).round(MathContext(precision))

    println("You entered dimensions of $length by $width feet.")
    println("The area is:")
    println("$areaFeet square feet")
    println("$areaMeters square meters")
}
