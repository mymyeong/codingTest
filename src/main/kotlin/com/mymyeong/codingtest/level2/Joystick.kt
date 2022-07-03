package com.mymyeong.codingtest.level2

class Joystick {
    fun solution(name: String): Int {
        val alphaMap = mutableMapOf(
            ("A" to 0),
            ("B" to 1),
            ("C" to 2),
            ("D" to 3),
            ("E" to 4),
            ("F" to 5),
            ("G" to 6),
            ("H" to 7),
            ("I" to 8),
            ("J" to 9),
            ("K" to 10),
            ("L" to 11),
            ("M" to 12),
            ("N" to 13),
            ("O" to 12),
            ("P" to 11),
            ("Q" to 10),
            ("R" to 9),
            ("S" to 8),
            ("T" to 7),
            ("U" to 6),
            ("V" to 5),
            ("W" to 4),
            ("X" to 3),
            ("Y" to 2),
            ("Z" to 1)
        )
        var count = 0

        val list = name.chunked(1).map {
            alphaMap[it] ?: 0
        }.toIntArray()

        println(list.contentToString())
        println(list.sum())
        println()

        for(i in 0 until  list.size/2) {

            println(list[i])
            println(list[name.length-i-1])

//            if(list[i] != 0) {
                count++
//            }
//            if(list[name.length-i-1] != 0) {
                count++
//            }

            println()
        }

        println("count:$count")
        return list.sum()+count-1
    }
}