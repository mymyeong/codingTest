package com.mymyeong.codingtest.level2

import kotlin.math.absoluteValue

class Formula {

    fun solution(expression: String): Long {
        val operators = arrayOf(
            arrayOf("+", "-", "*"),
            arrayOf("+", "*", "-"),
            arrayOf("-", "+", "*"),
            arrayOf("-", "*", "+"),
            arrayOf("*", "-", "+"),
            arrayOf("*", "+", "-")
        )
        val tokenize = tokenize(expression)
        val result = mutableListOf<Long>()

        operators.forEach { it ->
            val temp = mutableListOf<String>()
            temp.addAll(tokenize)
            it.forEach { operator ->
                while (temp.contains(operator)) {
                    val index = temp.indexOf(operator)
                    val val1 = temp[index - 1]
                    val val2 = temp[index + 1]
                    val val3 = calculate(val1.toLong(), val2.toLong(), operator)

                    temp[index - 1] = val3.toString()
                    temp.removeAt(index)
                    temp.removeAt(index)
                }
            }
            result.add(temp[0].toLong().absoluteValue)
        }

        return result.maxOrNull()!!
    }

    private fun tokenize(expression: String): List<String> {
        var expressions = expression.replace("+", " + ")
        expressions = expressions.replace("-", " - ")
        expressions = expressions.replace("*", " * ")
        return expressions.split(" ")
    }

    private fun calculate(val1: Long, val2: Long,  operator: String): Long {
        return when(operator) {
            "+" -> val1 + val2
            "-" -> val1 - val2
            "*" -> val1 * val2
            else -> 0
        }
    }
}