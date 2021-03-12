package com.igorwojda.codingpuzzle.newInTown.addUpTo

fun addUpTo(n: Int): Int {
    var result = 0
    for (num in 1..n)
        result += num

    return result
}
