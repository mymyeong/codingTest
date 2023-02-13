package com.mymyeong.codingtest.peoplefund

import java.math.BigDecimal
import java.math.RoundingMode

class PowersOf2 {

    fun isPower(arr: Array<Int>): Array<Int> {
        return arr.map { i ->
            if(i != 0 && i and (i-1) == 0) {
                1
            } else {
                0
            }
        }.toTypedArray()
    }
}

fun main() {
    PowersOf2().isPower(arrayOf(0, 1)).forEach { println(it) }

    /*
    1
    0
    0
    0
    0
    1
    0
    0
     */
}