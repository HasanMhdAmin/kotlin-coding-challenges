package com.igorwojda.codingpuzzle.newInTown.countDown

fun countDown(n: Int): List<Int> {

    val result: MutableList<Int> = mutableListOf()

    for (i in n downTo 0) {
        result.add(i)
    }

    return result

}
