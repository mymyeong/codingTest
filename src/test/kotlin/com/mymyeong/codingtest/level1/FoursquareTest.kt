package com.mymyeong.codingtest.level1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FoursquareTest {

    val foursquare: Foursquare = Foursquare()

    @Test
    fun solution() {
        assertEquals(foursquare.solution(8, 12), 80)
    }
}