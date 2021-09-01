package br.com.portfolio.felipe.gadelha.teste

import br.com.portfolio.felipe.gadelha.entity.Client
import br.com.portfolio.felipe.gadelha.entity.CurrentAccount
import br.com.portfolio.felipe.gadelha.entity.SavingsAccount

fun accountsTest() {
    val currentAccount = CurrentAccount(
        holder = Client(
            name = "Felipe",
            cpf = "123.655.878-09",
            password = 1
        ),
        number = 1000
    )

    val savingsAccount = SavingsAccount(
        holder = Client(
            name = "Isabella",
            cpf = "434.324.432-46",
            password = 2
        ),
        number = 1001
    )

    currentAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Saldo corrente: ${currentAccount.balance}")
    println("Saldo corrente: ${currentAccount.balance}")

    currentAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("Saldo após saque corrente: ${currentAccount.balance}")
    println("Saldo após saque poupança: ${savingsAccount.balance}")

    currentAccount.transfer(100.0, savingsAccount, 2)

    println("Saldo após transferir corrente para poupança: ${currentAccount.balance}")
    println("Saldo após receber transferencia: ${savingsAccount.balance}")

    savingsAccount.transfer(100.0, currentAccount, 2)
}
