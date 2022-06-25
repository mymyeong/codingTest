package com.mymyeong.codingtest.level2

import java.util.*


class Work {

    class Work internal constructor(progress: Int, speed: Int) {
        var progress = 0
        var speed = 0

        init {
            this.progress = progress
            this.speed = speed
        }
    }

    fun solution(progresses: IntArray, speeds: IntArray): IntArray? {
        val list = LinkedList<Work>()
        val result = ArrayList<Int>()
        for (i in progresses.indices) {
            list.add(Work(progresses[i], speeds[i]))
        }
        while (true) {
            for (w in list) {
                w.progress += w.speed
            }
            var doneCnt = 0
            while (true) {
                if (!list.isEmpty() && list.peekFirst().progress >= 100) {
                    list.removeFirst()
                    doneCnt++
                } else {
                    break
                }
            }
            if (doneCnt > 0) {
                result.add(doneCnt)
            }
            if (list.isEmpty()) {
                break
            }
        }
        return result.stream().mapToInt { i: Int -> i }.toArray()
    }
}