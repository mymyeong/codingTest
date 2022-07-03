package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class JoystickTest {

    private val joystick = Joystick()

    @Test
    fun solution() {
//        joystick.solution("JAZ")
        assertEquals(joystick.solution("JAZ"), 11)
        assertEquals(joystick.solution("JEROEN"), 56)
        assertEquals(joystick.solution("JAN"), 23)
    }
}