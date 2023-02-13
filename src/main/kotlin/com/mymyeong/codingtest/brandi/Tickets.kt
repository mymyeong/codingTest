package com.mymyeong.codingtest.brandi

class Tickets {

    fun solution(tickets: Int, request: Array<IntArray>): Int {
        var sell = tickets
        request.sortedWith(compareBy({ it[0] }, { -it[1] })).forEach {
            if(sell >= it[1]) {
                sell -= it[1]
            }
        }

        return tickets - sell
    }
}

fun main() {
    println(Tickets().solution(10, arrayOf(intArrayOf(2, 3), intArrayOf(1, 7), intArrayOf(2, 4), intArrayOf(3, 5))))
    println(Tickets().solution(
        2000,
        arrayOf(intArrayOf(3, 1), intArrayOf(2, 5), intArrayOf(2, 10), intArrayOf(3, 8), intArrayOf(1, 2))
    ))
}