package br.com.portfolio.felipe.gadelha.entity

import br.com.portfolio.felipe.gadelha.exception.FailAuthenticationException
import br.com.portfolio.felipe.gadelha.exception.InsufficientFundsException


abstract class Account(
    val holder: Client,
    val number: Int): Authentication {

    var balance = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando Conta")
        total++
    }

    override fun authenticate(password: Int): Boolean {
        return holder.authenticate(password)
    }

    fun deposit(value: Double) {
        if (value > 0) this.balance += value
    }

    open fun withdraw(value: Double) {
        if (balance >= value) balance -= value
    }

    open fun transfer(value: Double, destiny: Account, password: Int) {
        if (balance < value) {
            throw InsufficientFundsException(
                message = "O saldo é insuficiente, saldo atual: $balance, valor a ser subtraido $value"
            )
        }
        if (!authenticate(password)){
            throw FailAuthenticationException()
        }
        balance -= value
        destiny.deposit(value);
    }
}

class SalaryAccount(
    holder: Client,
    number: Int
): Account(
    holder = holder,
    number = number
) {

    override fun withdraw(value: Double) {
        if (this.balance >= value){
            this.balance -= value
        }
    }

}

class SavingsAccount(
    holder: Client,
    number: Int
): Account(
    holder = holder,
    number = number
) {

    override fun withdraw(value: Double) {
        if (this.balance >= value){
            this.balance -= value
        }
    }

}

class CurrentAccount(
    holder: Client,
    number: Int
) :
    Account(
        holder = holder,
        number = number
    ) {
    override fun withdraw(value: Double) {
        val taxValue = value + 0.1
        if (this.balance >= taxValue){
            this.balance -= taxValue
        }
    }
}

class TransferAccount(
    holder: Client,
    number: Int
): Account(
    holder = holder,
    number = number
) {

}