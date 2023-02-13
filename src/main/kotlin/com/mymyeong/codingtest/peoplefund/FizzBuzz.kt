package com.mymyeong.codingtest.peoplefund

class FizzBuzz {

    fun fizzBuzz(n: Int): Unit {
        (1..n).forEach { i ->

            if (Math.floorMod(i, 3) == 0 && Math.floorMod(i, 5) == 0) {
                println("FizzBuzz")
            } else if (Math.floorMod(i, 3) == 0 && Math.floorMod(i, 5) != 0) {
                println("Fizz")
            } else if (Math.floorMod(i, 3) != 0 && Math.floorMod(i, 5) == 0) {
                println("Buzz")
            } else {
                println(i)
            }
        }
    }


}

fun main() {
    FizzBuzz().fizzBuzz(15)
}