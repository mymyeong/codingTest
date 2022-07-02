package com.mymyeong.codingtest.level2

class Camouflage {
    fun solution(clothes: Array<Array<String>>): Int {
        val map: HashMap<String, Int> = HashMap()
        for (i in clothes.indices) {
            map.merge(clothes[i][1], 1) { a: Int, b: Int -> Integer.sum(a, b) }
        }
        var answer = 0
        for (key in map.keys) {
            answer += map[key]!! + answer * map[key]!!
        }
        return answer
    }
}