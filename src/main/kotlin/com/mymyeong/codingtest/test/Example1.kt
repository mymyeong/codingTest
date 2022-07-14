package com.mymyeong.codingtest.test

class Example1 {
    fun example(arrays: List<IntArray>): MutableList<IntArray> {
        val result = mutableListOf<IntArray>()

        if(arrays.isEmpty()) {
            return result
        }

        arrays.sortedBy {
            it[0]
        }

        result.add(arrays[0])

        for(i in 1 until arrays.size) {
            val last = result[result.size-1]
            if(last[1] >= arrays[i][0]) {
                last[1] = arrays[i][1]
            } else {
                result.add(arrays[i])
            }
        }
        return result
    }
}