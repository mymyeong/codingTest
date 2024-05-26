package com.mymyeong.codingtest.test

class ContinuousString {

    fun solution(s: String, k: Int): Int {
        var answer = 0

        for (i: Int in s.indices) {
            println("$i")
            for (n: Int in k until s.length - i + 1) {
//                println("$i $n")
                val temp = s.substring(i, i + n)
                if (temp.toCharArray().toSet().size == k) {
                    answer++
                    println(temp)
                }
            }
        }

        return answer
    }


}