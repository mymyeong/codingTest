package com.mymyeong.codingtest.test

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContinuousStringTest : FunSpec({

    val continuousString = ContinuousString()

    test("test1") {
        val result = continuousString.solution("abc", 2)
        result shouldBe 2
    }

    test("test2") {
        val result = continuousString.solution("aba", 2)
        result shouldBe 3
    }

    test("test3") {
        val result = continuousString.solution("aa", 1)
        result shouldBe 3
    }

    test("test4") {
        val result = continuousString.solution("abba", 2)
        result shouldBe 5
    }

})
