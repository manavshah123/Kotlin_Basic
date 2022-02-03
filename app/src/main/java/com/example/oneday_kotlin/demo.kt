package com.example.oneday_kotlin

import java.util.*

fun main(){

    for (i in generateSequence(0) { it }) {

    println("It's a first task of Kotlin Training")
    println("")
    println("Assignment -> 1")
    println("")
    println("Choose any of the below number")
    println("1) Fibonacci Series.\n" +
            "2) Prime number.\n" +
            "3) Palindrome number.\n" +
            "4) Factorial.\n" +
            "5) Armstrong number.\n" +
            "6) Sum of Digits.\n" +
            "7) Reverse Number.\n" +
            "8) Swap two numbers without using third variable.")
    println("Enter your choice")

    val a = readLine()?.toIntOrNull()

    when (a) {
        1 ->{
            println("Enter how much Fibonacci number you want to generate")
            val fibo = readLine()?.toIntOrNull()
            fibo(fibo)
        }
        2 -> {
            println("Enter a number")
            val pal = readLine()?.toIntOrNull()
            if (pal != null) {

                if(isPrimeNumber(pal)){
                    println("yes it's a Prime number")

                }
                else{
                    println("no it's not a Prime number")
                }
            }
        }
        3 -> {
            println("Enter a number")
            val pal = readLine()?.toIntOrNull()
            if (pal != null) {

                if(isPalindrome(pal)){
                    println("yes it's a Palindrom number")

                }
                else{
                    println("no it's not a Palindrom number")
                }
            }
        }
        4 -> {
            println("Enter a number")
            val pal = readLine()?.toIntOrNull()
            if (pal != null) {
                if (pal < 1) {
                    println("Please provide non-negative number.")
                } else {
                    println("Factorial of " + pal + " is : " + pal?.let { findFactorial(it) })
                }
            }

        }
        5 -> {
            println("Enter Number  : ")
            val sc = Scanner(System.`in`)
            val num: Long = sc.nextLong()

            // Call function to check number is Armstrong or not
            if (isArmStrongNo(num))
                println("$num is an Armstrong Number")
            else
                println("$num is not an Armstrong Number")
        }
        6-> {
            println("Enter a numbers")
            val pal = readLine()
            if (pal != null) {
                sumOfDigits(pal)
            }
        }
        7 -> {
            var num: Int
            val scanner = Scanner(System.`in`)
            print("Enter a number : ")
            num = scanner.nextInt()
            reverse(num)

        }
        8 -> {
            var first: Int
            var second: Int

            var sc = Scanner(System.`in`)

            print("Enter two numbers:")
            first = sc.nextInt()
            second = sc.nextInt()
            swapnum(first,second)
        }
    }
        println("")
        println("")
}
}
fun fibo(fibo: Int?) {
    var i = 1
    var t1 = 0
    var t2 = 1
    print("First $fibo terms: ")

    while (i <= fibo!!) {
        print("$t1 ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum

        i++
    }
}

fun isPrimeNumber(number: Int): Boolean {

    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun isPalindrome(number: Int): Boolean {
    var isPalindromeNumber = false
    var sum = 0
    var tempNum = number

    while (tempNum > 0) {
        val r = tempNum % 10
        sum = sum * 10 + r
        tempNum /= 10
    }
    if (sum == number) {
        isPalindromeNumber = true
    }
    return isPalindromeNumber
}

fun findFactorial(num: Int): Long {

    var factorial: Long = 1
    for (i in num downTo 2) {
        factorial = factorial * i
    }
    return factorial
}

fun isArmStrongNo(number: Long): Boolean {
    var isArmNumber = false
    var result : Long= 0
    var original = number

    val digits = original.toString().length

    while (original > 0) {
        val r = original % 10
        result +=Math.pow(r.toDouble(), digits.toDouble()).toLong()
        original /= 10
    }

    if (result == number) {
        isArmNumber = true
    }
    return isArmNumber
}

fun sumOfDigits(str: String) {
    val arr = str.toList().map({it.toString().toInt()})
    val sum = arr.sum()
    print(sum.toString())
}

fun reverse(num: Int) {
    var number = num
    var reverse: Int = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10;
        number /= 10;
    }
    println("Reverse number is : $reverse")
}

fun swapnum(first: Int, second: Int) {

    var x= first
    var y = second

    x = x + y
    y = x - y
    x = x - y

    println("After swap x is:$x")
    println("After Swap y is:$y")
}