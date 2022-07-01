package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FormulaTest {

    private val formula = Formula()

    @Test
    fun solution() {
        Assertions.assertEquals(formula.solution("100-200*300-500+20"), 60420)
        Assertions.assertEquals(formula.solution("50*6-3*2"), 300)
    }
}