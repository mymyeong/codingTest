package com.mymyeong.codingtest.level3

class Jewel {
    fun solution(gems: Array<String>): IntArray {
        val gemCount = gems.distinct().count()
        println("gemCount: ${gems.count()}, gemDistinctCount: $gemCount")
        val results = mutableListOf<IntArray>()
        var minIndexSize = gems.size
        loop1@ for (i: Int in 0..gems.size - gemCount) {
            loop2@ for (j: Int in gemCount + i..gems.size) {
                val copyOfRange = gems.copyOfRange(i, j)
                println("$i, $j > ${copyOfRange.joinToString { it }}")
                if (copyOfRange.distinct().count() == gemCount) {
                    results.add(intArrayOf(i + 1, j))
                    val indexSize = j - i
                    minIndexSize = minOf(minIndexSize, indexSize)
                    if (minIndexSize == gemCount) {
                        break@loop1
                    } else if (indexSize >= minIndexSize) {
                        break@loop2
                    }
                }
            }
        }

        return results.minByOrNull { it[1] - it[0] } ?: intArrayOf(1, gems.count())
    }

    fun solution1(gems: Array<String>): IntArray {

        return intArrayOf()
    }
}