package com.example.firsproject

fun main(){
    plus(10, 2)
    minus(10, 2)
    inc(10, 2)
    div(10.toDouble(), 2.toDouble())
}

fun plus(a: Int, b: Int){
    val  result: Int = a + b
    println(result)
}
fun minus(a: Int, b: Int){
    val  result: Int = a - b
    println(result)
}
fun inc(a: Int, b: Int){
    val  result: Int = a * b
    println(result)
}

fun div(a: Double, b: Double){
    val  result: Double = a / b
    println(result)
}

/*
Вывод:
12
8
20
5
 */