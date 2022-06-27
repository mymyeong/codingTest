package com.mymyeong.codingtest.level2

class Rotation {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        val rectangle = getRectangle(rows, columns)
        queries.forEach {
            rotationRectangle(rectangle, it)
            answer.add(getRange(rectangle, it).minOrNull()!!)
        }
        return answer.toIntArray()
    }

    private fun getRectangle(rows: Int, columns: Int): Array<IntArray> {
        return Array(rows) { i -> IntArray(columns) { j -> (i * columns) + j + 1 } }
    }

    private fun rotationRectangle(rectangle: Array<IntArray>, query: IntArray) {
        val fromY = query[0] - 1
        val fromX = query[1] - 1
        val toY = query[2] - 1
        val toX = query[3] - 1
        var temp: Int = rectangle[fromY][fromX]

        for(x in fromX .. toX) {
            rectangle[fromY][x] = temp.also { temp = rectangle[fromY][x] }
        }
        for(y in fromY + 1  ..    toY ) {
            rectangle[y][toX] = temp.also { temp = rectangle[y][toX] }
        }
        for(x in toX -1 downTo fromX ) {
            rectangle[toY][x] = temp.also { temp = rectangle[toY][x] }
        }
        for(y in toY - 1 downTo fromY) {
            rectangle[y][fromX] = temp.also { temp = rectangle[y][fromX] }
        }
    }

    private fun getRange(rectangle: Array<IntArray>, query: IntArray): MutableSet<Int> {
        val fromY = query[0] - 1
        val fromX = query[1] - 1
        val toY = query[2] - 1
        val toX = query[3] - 1

        val result = mutableSetOf<Int>()

        result.addAll( rectangle[fromY].copyOfRange(fromX, toX + 1).toTypedArray())
        result.addAll( rectangle[toY].copyOfRange(fromX, toX + 1).toTypedArray())
        for(y in fromY + 1  until  toY) {
            result.add(rectangle[y][fromX])
            result.add(rectangle[y][toX])
        }

        return result
    }

    private fun printRectangle(rectangle: Array<IntArray>) {
        rectangle.forEach {
            it.forEach { item ->
                print("$item\t")
            }
            println()
        }
    }
}
