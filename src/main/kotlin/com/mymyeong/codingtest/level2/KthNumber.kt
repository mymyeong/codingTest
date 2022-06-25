package com.mymyeong.codingtest.level2

class KthNumber {

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)

        for (index in commands.indices) {
            val i = commands[index][0]
            val j = commands[index][1]
            val k = commands[index][2]

            val temp: IntArray = array.copyOfRange(i - 1, j)

            answer[index] = temp.sorted()[k-1]
        }

        return answer
    }
}