package com.igorwojda.codingpuzzle.newInTown.getOddNumbers

public fun filterOdd(list: List<Int>): List<Int> {
    return list.filter { item -> item % 2 != 0 }
}
