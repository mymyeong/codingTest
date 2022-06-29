package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BracketTest {

    private val bracket = Bracket()

    @Test
    fun solution() {
        Assertions.assertEquals(bracket.solution("(()())()"), "(()())()")
        Assertions.assertEquals(bracket.solution(")("), "()")
        Assertions.assertEquals(bracket.solution("()))((()"), "()(())()")
    }
}