package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class JoystickTest {

    private val joystick = Joystick()

    @Test
    fun solution() {
//        assertEquals(joystick.solution("JAZ"), 11)
//        assertEquals(joystick.solution("JEROEN"), 56)
//        assertEquals(joystick.solution("JAN"), 23)
        assertEquals(joystick.solution("LABLPAJM"), 61)
//        assertEquals(joystick.solution("BMOABA"), 30)
    }
}