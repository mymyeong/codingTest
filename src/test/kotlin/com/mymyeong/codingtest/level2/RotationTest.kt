package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

internal class RotationTest {

    private val rotation: Rotation = Rotation()

    @Test
    fun solution() {
        val queries = arrayOf(intArrayOf(2, 2, 5, 4), intArrayOf(3, 3, 6, 6), intArrayOf(5, 1, 6, 3))

        assert(rotation.solution(6, 6, queries).contentEquals(arrayOf(8, 10, 25).toIntArray()))
    }
}