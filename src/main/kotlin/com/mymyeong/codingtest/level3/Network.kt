package com.mymyeong.codingtest.level3

class Network {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = computers.size

        for (i: Int in 0 until computers.size - 1) {
            if (computers[i + 1][i] == 1 && computers[i][i + 1] == 1) {
                answer--
            }
        }

        return answer
    }
}

fun main() {
    Network().solution(
        3, arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 0, 0)
        )
    )
}