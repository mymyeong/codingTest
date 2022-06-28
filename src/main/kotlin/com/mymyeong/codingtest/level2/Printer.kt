package com.mymyeong.codingtest.level2

import java.util.*


class Printer {
    class PeriodDoc internal constructor(location: Int, priod: Int) {
        var location = -1
        var period = 0

        init {
            this.location = location
            period = priod
        }

        override fun equals(other: Any?): Boolean {
            return location == (other as PeriodDoc?)!!.location
        }

        override fun hashCode(): Int {
            var result = location
            result = 31 * result + period
            return result
        }
    }

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
            } else if (printQueue.subList(0, printQueue.size).stream().filter { v: PeriodDoc -> v.period > temp.period }
                    .count() <= 0) {
                result.add(temp)
            } else {
                printQueue.add(temp)
            }
        }
        return result.indexOf(PeriodDoc(location, priorities[location])) + 1
    }
}