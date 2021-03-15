package com.igorwojda.codingpuzzle.newInTown.linearSearch

fun getIndex(list: List<String>, str: String): Int {

    var result = -1

    for (index in list.indices) {
        if (list[index] == str) {
            result = index
            break
        }
    }

    return result

}
