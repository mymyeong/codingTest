package com.mymyeong.codingtest.level2

class PrimeNumber {

    lateinit var set: HashSet<Int>

    fun solution(numbers: String): Int {
        set = HashSet()
        permutation("", numbers)
        return set.filter { isPrime(it) }.size
    }

    private fun permutation(preNum: String, left: String) {
        for (x in left.indices) {
            val curr = preNum + left[x]
            val currInt = curr.toInt()
            set.add(currInt)
            permutation(curr, left.removeRange(x, x+1))
        }
    }

    private fun isPrime(n: Int): Boolean {
        if(n == 1 || n == 0) {
            return false
        }

        var i = 2
        while(i * i <= n) {
            if(n % i++ == 0)
                return false
        }
        return true
    }
}