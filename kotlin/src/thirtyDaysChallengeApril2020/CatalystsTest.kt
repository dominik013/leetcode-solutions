package thirtyDaysChallengeApril2020

import java.math.BigInteger
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    //println(fibonacci(38))
    /*println(kochPerimeter(9, 1))
    println(kochPerimeter(243, 3))
    println(kochPerimeter(19683, 7))
    println(kochPerimeter(531441, 7))
    println(kochPerimeter(531441, 9))
    */
    /*println(deletablePrime(4125673))
    println(deletablePrime(41256793))
    println(deletablePrime(337424981))
    println(deletablePrime(537430451))
    println(deletablePrime(200899998))
    println(deletablePrime(537499093))
    println(deletablePrime(2147483059))
    println(deletablePrime(410256793))
    println(deletablePrime(567629137))*/
    println(deletablePrime(46216567629137))
}

fun deletablePrime(number: Long): Int {
    var count = 0
    val arr = getNumberArray(number)
    var idx = 0
    while (idx < arr.size) {
        val newArr = arr.toIntArray().copyOf().toMutableList()
        newArr.removeAt(idx++) // Only remove temporarily
        val n = constructNumber(newArr)

        if (isPrime(n)) {
            if (n / 10 == 0L) {
                count++
            }
            else {
                count += deletablePrime(n)
            }
        }
    }

    return count
}

fun constructNumber(arr: List<Int>): Long {
    var result = 0L
    var multiplier = 1L
    for (i in arr.size - 1 downTo 0) {
        result += (arr[i] * multiplier)
        multiplier *= 10L
    }

    return result
}

fun getNumberArray(number: Long): MutableList<Int> {
    val arr = mutableListOf<Int>()
    var num = number
    while (num != 0L) {
        val n = num % 10
        num /= 10
        arr.add(0, n.toInt())
    }

    return arr
}

fun isPrime(number: Long): Boolean {
    if (number == 1L)
        return false

    if (number == 2L)
        return true

    if (number % 2 == 0L)
        return false

    val root = sqrt(number.toDouble()).toLong()

    for (i in 3 until (root + 1) step 2) {
        if ((number % i) == 0L) {
            return false
        }
    }

    return true
}

fun kochPerimeter(length: Int, iterations: Int): Double {
    return (4 * length * ((5.0 / 3.0).pow(iterations)))
}

fun fibonacci(number: Int): Int {
    if (number <= 2) {
        return number
    }
    var first = 0
    var second = 1

    for (i in 2 .. number) {
        val result = first + second
        first = second
        second = result
    }

    return second
}