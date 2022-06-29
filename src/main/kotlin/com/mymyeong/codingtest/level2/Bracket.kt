package com.mymyeong.codingtest.level2

class Bracket {
    fun solution(p: String): String {
        return findBracket(p.toCharArray())
    }

    private fun findBracket(charList: CharArray): String {
        if(charList.isEmpty() || charList.size < 2) {
            return ""
        }

        val (u, v) = getCorrectBracket(charList)
//        println("u=${u.contentToString()}, v = ${v.contentToString()}")
        return if(isValidBracket(u)) {
            String(u) + findBracket(v)
        } else {
            return "(${findBracket(v)})${swapBracket(u)}"
        }
    }

    private fun swapBracket(u: CharArray): String {
        return if(u.size >= 4) {
            when(u[1]) {
                ')' -> "("
                else -> ")"
            } +
            when(u[2]) {
                ')' -> "("
                else -> ")"
            }
        } else {
            ""
        }
    }

    private fun getCorrectBracket(charList: CharArray): Pair<CharArray, CharArray> {
        val temp = mutableListOf<Char>()
        for(i in 0 until  charList.size -1 step 2) {
            temp.add(charList[i])
            temp.add(charList[i+1])
            if(isCorrectBracket(temp)) {
                break
            }
        }

        val a = temp.subList(0, temp.size).toCharArray()
        val b = charList.copyOfRange(temp.size, charList.size)
        return Pair(a, b)
    }

    private fun isValidBracket(u: CharArray): Boolean {
        val temp = mutableListOf<Char>()

        for(i in u.indices) {
            if(u[i] == ')') {
                if(temp.isNotEmpty()) {
                    temp.removeLast()
                } else {
                    temp.add(u[i])
                }
            } else {
                temp.add('(')
            }
        }

        return temp.size == 0
    }

    private fun isCorrectBracket(charMutableList: MutableList<Char>): Boolean {
        val openCount = charMutableList.count { it == '(' }
        val closeCount = charMutableList.count { it == ')' }

        return (openCount == closeCount)
    }
}