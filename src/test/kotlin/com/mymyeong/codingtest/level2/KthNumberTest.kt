package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

internal class KthNumberTest {

    private var kthNumber: KthNumber = KthNumber()

    @Test
    fun test1() {
        val array : IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
        val command = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        assert(kthNumber.solution(array, command).contentEquals(intArrayOf(5, 6, 3)))
    }
}