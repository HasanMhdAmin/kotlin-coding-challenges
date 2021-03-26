package com.igorwojda.codingpuzzle.newInTown.formatTrainRoute

fun formatTrainRoute(stations: List<String>): String {
    var result: String = "Train is calling at "
    stations.forEachIndexed { index, station ->
        when (station) {
            stations.first() -> result += station
            stations.last() -> result += " and $station"
            else -> result += ", $station"
        }
    }
    return result
}