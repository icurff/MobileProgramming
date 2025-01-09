package com.example.week2

fun main() {
//    println("enter first number :")
//    val x:Double = readLine()?.toDouble() ?: 0.0;
//    println("enter second number :")
//    val y:Double = readLine()?.toDouble() ?: 0.0
//    println("sum of 2 number is :"+ addNumbers(x,y))

    println("enter 5 numbers")
    val listOfNumbers = mutableListOf<Int>()
    for (i in 1..5) {
        readlnOrNull()?.let { listOfNumbers.add(it.toInt()) }
    }
    printFilteredList(listOfNumbers)

}

fun addNumbers(x: Double = 0.0, y: Double = 0.0): Double {
    val temp = x + y
    return temp
}

fun printFilteredList(x: List<Int>) {
    val filteredList = x.filter { x1 -> x1 % 3 == 0 }
    for (x1 in filteredList) {
        print("$x1 ")
    }
}