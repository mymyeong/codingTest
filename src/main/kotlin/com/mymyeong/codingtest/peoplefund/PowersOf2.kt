package com.mymyeong.codingtest.peoplefund

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
}