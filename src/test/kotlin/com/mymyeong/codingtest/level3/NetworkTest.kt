package com.mymyeong.codingtest.level3

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NetworkTest : FunSpec({
    val network = Network()

    test("test case 1") {
        val result = network.solution(
            3, arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(0, 0, 0)
            )
        )

        result shouldBe 2
    }

    test("test case 2") {
        val result = network.solution(
            3, arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 1, 1)
            )
        )

        result shouldBe 1
    }

    test("test case 3") {
        val result = network.solution(
            3, arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 1, 1)
            )
        )

        result shouldBe 1
    }

    test("test case 4") {
        val result = network.solution(
            4, arrayOf(
                intArrayOf(1, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 0, 1, 0),
                intArrayOf(0, 0, 0, 1)
            )
        )

        result shouldBe 4
    }
})
