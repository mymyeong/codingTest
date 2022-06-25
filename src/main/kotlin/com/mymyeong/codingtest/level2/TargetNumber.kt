package com.mymyeong.codingtest.level2

class TargetNumber {

    class Node(
        var n: Int,
        var left: Node? = null,
        var right: Node? = null
    )

    fun solution(numbers: IntArray, target: Int): Int {
        val node = makeNode(Node(0), numbers)
        return getTargetSumCount(node, 0, target)
    }

    private fun makeNode(node: Node, numbers: IntArray): Node {
        node.left = Node(numbers[0])
        node.right = Node(-numbers[0])
        if (numbers.size > 1) {
            makeNode(node.left!!, numbers.copyOfRange(1, numbers.size))
            makeNode(node.right!!, numbers.copyOfRange(1, numbers.size))
        }
        return node
    }

    private fun getTargetSumCount(node: Node, sum: Int, target: Int): Int {
        return if(node.left == null && node.right == null) {
            if((sum + node.n) == target) {
                1
            } else {
                0
            }
        } else {
            (getTargetSumCount(node.left!!, sum+node.n, target)
                    + getTargetSumCount(node.right!!, sum+node.n, target))
        }
    }

}