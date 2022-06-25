package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

internal class OpenchatTest {

    val openchat: Openchat = Openchat()

    @Test
    fun solution() {

        val solution = openchat.solution(
            arrayOf(
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
            )
        )

        val result = arrayOf("Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다.")

        assert(solution.contentEquals(result))
    }

}