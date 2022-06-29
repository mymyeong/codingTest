package com.mymyeong.codingtest.level2

import java.util.*


class Printer {
    data class PeriodDoc(
        var location: Int,
        var period: Int
    )

    fun solution(priorities: IntArray, location: Int): Int {
        val printQueue = LinkedList<PeriodDoc>()
        val result = LinkedList<PeriodDoc>()

        for (i in priorities.indices) {
            printQueue.add(PeriodDoc(i, priorities[i]))
        }

        while (!printQueue.isEmpty()) {
            val temp = printQueue.pop()
            if (printQueue.size == 1) {
                result.addLast(temp)
            } else if (printQueue.subList(0, printQueue.size).none { v: PeriodDoc -> v.period > temp.period }) {
                result.add(temp)
            } else {
                printQueue.add(temp)
            }
        }

        return result.indexOf(PeriodDoc(location, priorities[location])) + 1
    }
}