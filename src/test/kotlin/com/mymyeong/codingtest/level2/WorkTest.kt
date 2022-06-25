package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

internal class WorkTest {

    private val work: Work = Work()

    @Test
    fun solution() {
        assert(work.solution(arrayOf(93, 30, 55).toIntArray(), arrayOf(1, 30, 5).toIntArray())
            .contentEquals(arrayOf(2, 1).toIntArray()))
    }
}