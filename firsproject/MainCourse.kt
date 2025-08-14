package com.example.firsproject

fun main(){
   val name: String = "Egor"
    val surname: String = "Batargin"

    printPersonalInfo(name = name, surname =  surname) //Тут мы, например, можем явно указать, к кому аргументу какая относиться переменная
}


/*
Напишем функцию, которая печатае текст "Hello world"
 */
fun printHelloWorld() {
    print("Hello world")
}

/*
Напишем функцию, которая возвращает переменную с текстом "Hello"
Для возврата переменной мы используем return и в скобках после указываем возвращаемые переменные
 */
fun getTextHello(): String {
    val text: String = "Hello"
    return  (text)
}
/*
Напишем функцию, которая принимает переменную
 */

fun printHello(text: String){
    print(text)
}

/*
Функция принимает Имя и Фамилию и выводит их вместе.
Тут, например, выведет так
Egor Batargin
 */
fun printPersonalInfo(name: String, surname: String) {
    println("Hello, $name $surname")
}

