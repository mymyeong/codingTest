package com.mymyeong.codingtest.level3

import java.util.Stack

class Network {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visit = mutableSetOf<Int>()
        val stack: Stack<Int> = Stack()

        for (i: Int in 0 until computers.size - 1) {

        }

        return 0
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