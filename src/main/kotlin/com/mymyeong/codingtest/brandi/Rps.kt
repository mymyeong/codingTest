package com.mymyeong.codingtest.brandi

class Rps {

    fun solution(n: Int, m: Int, points: IntArray, hands: Array<String>): Int {

        var gameScore = 0
        val totalScore = mutableMapOf<Int, Int>()

        initTotalScore(n, totalScore)

        points.forEachIndexed { round, score ->

//            val hand = hands.map { it[round].toString() }
            val winners = getWinners(score, hands[round].toCharArray().map { it.toString() })

            gameScore += score
            if (winners.isNotEmpty()) {
                winners.forEach {
                    totalScore[it] = totalScore[it]!! + gameScore
                }
                gameScore = 0
            }
        }
        return totalScore.values.maxOrNull() ?: 0
    }

    private fun initTotalScore(totalPeople: Int, totalScore: MutableMap<Int, Int>) {
        (0 until totalPeople).forEach {
            totalScore[it] = 0
        }
    }

    fun getWinners(score: Int, hand: List<String>): List<Int> {
        val roundHand = hand.groupingBy { it }.eachCount()

        return if (roundHand.keys.count() == 2) {
            shape2(roundHand, score, hand)
        } else if (roundHand.keys.count() == 3) {
            shape3(roundHand, score, hand)
        } else {
            listOf()
        }
    }

    private fun shape2(
        roundHand: Map<String, Int>,
        score: Int,
        hand: List<String>
    ): List<Int> {
        var rps = rps(roundHand.keys.first(), roundHand.keys.last())

        return if (score >= 0) {
            getWinPlayerIndex(hand, rps)
        } else {
            rps = if (rps == roundHand.keys.first()) roundHand.keys.last() else roundHand.keys.first()
            getWinPlayerIndex(hand, rps)
        }
    }

    private fun shape3(roundHand: Map<String, Int>, score: Int, hand: List<String>): List<Int> {
        val shapeCount = roundHand.values.groupingBy { it }.eachCount()
        return when (shapeCount.keys.size) {
            1 -> { // 모든 카운트가 같을때
                listOf()
            }
            2 -> { // 두개 카운트 일때
                getWinPlayerIndex(
                    hand,
                    roundHand.filter { it.value == shapeCount.values.minByOrNull { it } }.keys.first()
                )
            }
            else -> { // 모두 다른 카운트 일때
                val filter = roundHand.filter { hand ->
                    !roundHand.filter { it.value == roundHand.values.maxOrNull() }.containsKey(hand.key)
                }

                var rps = rps(filter.keys.first(), filter.keys.last())

                if (score >= 0) {
                    getWinPlayerIndex(hand, rps)
                } else {
                    rps = if (rps == roundHand.keys.first()) roundHand.keys.last() else roundHand.keys.first()
                    getWinPlayerIndex(hand, rps)
                }
            }
        }
    }

    private fun getWinPlayerIndex(hand: List<String>, rps: String): List<Int> {
        val result = mutableListOf<Int>()
        hand.forEachIndexed { index, s -> if (s == rps) result.add(index) }
        return result
    }

    private fun rps(a: String, b: String): String {
        return if (a == "R") {
            if (b == "P") b else a
        } else if (a == "P") {
            if (b == "S") b else a
        } else {
            if (b == "R") b else a
        }
    }
}

fun main() {

    println(
        Rps().solution(
            6, 5, intArrayOf(5, -2, 1, 3, -5),
            arrayOf("PSPRSS", "SSRRSS", "RRRRRR", "RRSSPP", "SSSRRP")
        )
    )
}