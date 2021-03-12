package com.igorwojda.codingpuzzle.newInTown.rangeContainsRange

fun containsRange(range1: IntRange, range2: IntRange): Boolean {
    return range1.contains(range2.first) && range1.contains(range2.last)
}