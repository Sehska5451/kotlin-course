package main.kotlin.LeetCode
import kotlin.math.absoluteValue
class Solution {
    fun addDigits(num: Int): Int {
            val result = num.toString()
                .map { it.toString().toInt() }
                .sum()
        if(result >= 10) {
            return addDigits(result)
        }
        return result
    }
}

class Solution1 {
    fun firstUniqChar(s: String): Int {
        val charGroups = s.withIndex()
            .groupBy { it.value }
            .filter { it.value.size == 1 }
            .minByOrNull { it.value.first().index }

        return charGroups?.value?.first()?.index ?: -1
    }
}

//class Solution2 {
//    fun numberGame(nums: IntArray): IntArray {
//        val gameArray = nums.toMutableList()
//        val finalArray = mutableListOf<Int>()
//        gameArray.sort()
//        while(gameArray.isNotEmpty()) {
//            val min1 = gameArray[0]
//            val min2 = gameArray[1]
//            finalArray.add(min2)
//            finalArray.add(min1)
//            gameArray.removeFirst()
//            gameArray.removeFirst()
//        }
//        return finalArray.toIntArray()
//    }
//}



class Solution3 {
    fun countDigits(num: Int): Int {
        val digits = num.absoluteValue.toString().map { it.digitToInt() }
        var result: Int = 0
        for (i in digits.indices) {
            if (num % digits[i] == 0) {
                result += 1
            }
        }
        return result
    }
}

class Solution4 {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()


        val keypad = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )
        val result = mutableListOf<String>()

        fun backtrack(index: Int, current: StringBuilder) {
            if (index == digits.length) {
                result.add(current.toString())
                return
            }

            val letters = keypad[digits[index]] ?: return

            for (letter in letters) {
                current.append(letter)
                backtrack(index + 1, current)
                current.deleteCharAt(current.lastIndex)
            }
        }
        backtrack(0, StringBuilder())
        return result
    }
}

fun main() {
//    val solution = Solution()
//    println(solution.addDigits(12345))
//
//    val solution1 = Solution1()
//        println(solution1.firstUniqChar("Tony plaksa"))
//
//    val solution2 = Solution2()
//    val array1 = intArrayOf(5,4,2,3)
//    val res = solution2.numberGame(array1)
//    println(res.contentToString())

//    val solution3 = Solution().countDigits(1248)
//    println(solution)
//
//    val solution4 = Solution1().letterCombinations("29")
//    println(solution1)
}