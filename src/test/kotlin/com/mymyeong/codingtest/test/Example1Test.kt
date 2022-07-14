package com.mymyeong.codingtest.test

import org.junit.jupiter.api.Test

internal class Example1Test {

    private val example1 = Example1()

    @Test
    fun example() {
        val array = listOf<IntArray>(
            intArrayOf(1, 3),
            intArrayOf(2, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18),
        )

        val example = example1.example(array)
        example.forEach {
            println(it.contentToString())
        }
    }

    @Test
    fun example2() {
        val array = listOf<IntArray>(
            intArrayOf(1, 4),
            intArrayOf(4, 5)
        )

        val result = example1.example(array)
        result.forEach {
            println(it.contentToString())
        }
    }

    @Test
    fun example3() {
        val array = listOf<IntArray>(
            intArrayOf(1, 4)
        )

        val example = example1.example(array)
        example.forEach {
            println(it.contentToString())
        }
    }
}