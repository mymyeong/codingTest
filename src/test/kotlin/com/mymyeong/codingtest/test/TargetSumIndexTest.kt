package com.mymyeong.codingtest.test

import org.junit.jupiter.api.Test

internal class TargetSumIndexTest {

    private val targetSumIndex =TargetSumIndex()

    @Test
    fun solution() {
        val result = targetSumIndex.solution(intArrayOf(2, 7, 11, 15), 9)
        assert(result.contains(Pair(0, 1)))
    }
}