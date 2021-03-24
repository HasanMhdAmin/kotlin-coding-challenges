package com.igorwojda.codingpuzzle.newInTown.countUpAndDown

fun countUpAndDown(n: Int): List<Int> {
    return (0..n).toList() + (n-1).downTo(0)
}
