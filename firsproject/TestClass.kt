package com.example.firsproject

fun main() {
    val person = Person("Egor")
    val  person_2 = Person("Maxim", "for trevel")

    println("${person.name} has ${person.accounts.size}")
    println("${person_2.name} has ${person_2.accounts.size}")

}


