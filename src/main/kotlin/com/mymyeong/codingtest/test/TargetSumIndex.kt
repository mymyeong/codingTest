package com.mymyeong.codingtest.test

class TargetSumIndex {
    fun solution(intList: IntArray, target: Int): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()
        for(i in 0 until intList.size-1) {
            for(j in 1 until  intList.size) {
                if((intList[i] + intList[j]) == target) {
                    result.add(Pair(i, j))
                }
            }
        }
        return result
    }
}