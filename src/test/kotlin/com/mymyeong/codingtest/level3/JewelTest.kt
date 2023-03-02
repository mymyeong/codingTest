package com.mymyeong.codingtest.level3

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class JewelTest : FunSpec({
    val jewel: Jewel = Jewel()

    test("test1") {
        val result = jewel.solution(arrayOf("DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"))
//        println("result: ${result[0]}, ${result[1]}")
        result[0] shouldBe 3
        result[1] shouldBe 7
    }

    test("test2") {
        val result = jewel.solution(arrayOf("AA", "AB", "AC", "AA", "AC"))
//        println("result: ${result[0]}, ${result[1]}")
        result[0] shouldBe 1
        result[1] shouldBe 3
    }

    test("test3") {
        val result = jewel.solution(arrayOf("XYZ", "XYZ", "XYZ"))
//        println("result: ${result[0]}, ${result[1]}")
        result[0] shouldBe 1
        result[1] shouldBe 1
    }

    test("test4") {
        val result = jewel.solution(arrayOf("ZZZ", "YYY", "NNNN", "YYY", "BBB"))
//        println("result: ${result[0]}, ${result[1]}")
        result[0] shouldBe 1
        result[1] shouldBe 5
    }

    test("test5") {
        val result = jewel.solution(arrayOf("A", "B", "B", "B", "C", "D", "D", "D", "D", "D", "D", "D", "B", "C", "A"))
//        println("result: ${result[0]}, ${result[1]}")
        result[0] shouldBe 12
        result[1] shouldBe 15
    }
})
