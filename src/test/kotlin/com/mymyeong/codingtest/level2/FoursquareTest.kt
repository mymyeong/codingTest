package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FoursquareTest {

    private val foursquare: Foursquare = Foursquare()

    @Test
    fun solution() {
        assertEquals(foursquare.solution(8, 12), 80)
    }
}