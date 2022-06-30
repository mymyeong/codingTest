package com.mymyeong.codingtest.level2

class MaxNumber {
    fun solution(numbers: IntArray): String {
        return numberStringTrim((numbers.sortedWith(kotlin.Comparator { num1, num2 ->
            if(num1 == num2) {
                return@Comparator 0
            }

            val a1 = ("$num1$num2").toLong()
            val a2 = ("$num2$num1").toLong()
            if(a1 > a2) {
                return@Comparator -1
            } else {
                return@Comparator 1
            }
        }).joinToString("")))
    }

    private fun numberStringTrim(str: String): String {
        return if (str.length > 1) {
            if (str[0] == '0') {
                numberStringTrim(str.substring(1))
            } else {
                str
            }
        } else str
    }
}