package com.example.firsproject

/*
Это класс для работы с дипозитом. В  класс мы можем передавать параметр конструктора. У нас это name
 */
class DepositAccount (val name: String) {
    private var avalibleFunds: Double = 790_000.0
    fun getAvailFunds():  Double {
        return avalibleFunds
    }
    // Метод снятия денег со счета. Возврат - то, сколько снимется
    fun withdrawMoney(amount: Double): Double {
        return if (amount > 0 && amount <= avalibleFunds) {
            avalibleFunds -= amount
            amount // В нашей конструкци при выполнении условия вернется amount
        } else{
            0.0 //Иначе вернется 0.0
        }
    }

    fun depositMoney(amount: Double) {
        if (amount > 0) {
            avalibleFunds += amount
            println("Успешено внесено $amount рублей")
        } else {
            println("Невозомжно внести отрицательную сумму")
        }
    }
}


// Вариант с абстрактным классом
abstract class PaymentMethod {
    abstract fun processPayment(amount: Double)

    fun validateAmount(amount: Double) {
        // общая логика валидации
    }
}

class Pay(): PaymentMethod() {
    override fun processPayment(amount: Double) {
        // Логика
    }
}

// Вариант с обычным классом

open class Payment{
    fun validateAmount(amount: Double) {
        // общая логика валидации
    }
}

class Pay_2(): Payment(){
    fun processPayment(amount: Double){
        //Логика
    }
}