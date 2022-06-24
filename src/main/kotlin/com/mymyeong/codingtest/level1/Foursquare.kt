package com.mymyeong.codingtest.level1

import java.lang.Integer.max
import java.lang.Integer.min

class Foursquare {

    fun gcd(a: Int, b: Int): Int {
        val maximum = max(a, b)
        val minimum = min(a, b)

        return if (minimum == 0) {
            max(a, b)
        } else {
            gcd(minimum, maximum % minimum)
        }
    }

    fun solution(w: Int, h: Int): Long {
        return w.toLong() * h.toLong() - (w + h - gcd(w, h)).toLong()
    }
}