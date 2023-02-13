package com.mymyeong.codingtest.baekjoon

import java.util.*

object Virus {
    var n : Int = 0
    var m : Int = 0

    var graph = Array(101){Array(101){0}}
    var visit = Array(101){false}

    @JvmStatic
    fun main(args : Array<String>) = with(Scanner(System.`in`)) {
        var a : Int
        var b : Int

        n = nextInt()
        m = nextInt()

        for(i in 0 until m){
            a = nextInt()
            b=  nextInt()

            graph[a][b] = 1
            graph[b][a] = 1
        }

        dfs(1)

        println(visit.filter { it }.size-1)
        println(visit.toList())
    }

    private fun dfs(x : Int){
        visit[x] = true

        for(i in 1..n){
            if(!visit[i] || graph[x][i] == 0) {
                continue
            }

            dfs(i)
        }
    }
}