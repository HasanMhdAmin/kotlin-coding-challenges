package com.igorwojda.codingpuzzle.newInTown.capitalizeSentence

fun capitalizeSentence(str: String): String {
    return str.split(" ").joinToString(" ") { it.capitalize() }
}