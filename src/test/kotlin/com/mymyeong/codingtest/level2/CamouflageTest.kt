package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CamouflageTest {

    private val camouflage = Camouflage()

    @Test
    fun solution() {

        assertEquals(camouflage.solution(
            arrayOf(arrayOf("yellow_hat", "headgear"),
                arrayOf("blue_sunglasses", "eyewear"),
                arrayOf("green_turban", "headgear"))
        ), 5)
        assertEquals(camouflage.solution(
            arrayOf(arrayOf("crow_mask", "face"),
                arrayOf("blue_sunglasses", "face"),
                arrayOf("smoky_makeup", "face"))
        ), 3)
    }
}