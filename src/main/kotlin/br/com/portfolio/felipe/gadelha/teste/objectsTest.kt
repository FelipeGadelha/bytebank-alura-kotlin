package br.com.portfolio.felipe.gadelha.teste

import br.com.portfolio.felipe.gadelha.entity.*

fun objectsTest() {
    val isabella = object : Authentication {
        val name: String = "Isabella"
        val cpf: String = "111.111.111-11"
        val password: Int = 1000

        override fun authenticate(password: Int) = this.password == password
    }

    val internalSystem = InternalSystem()
    internalSystem.enter(isabella, 1000);

    println("nome do cliente ${isabella.name}")


    val felipe = Client(
        name = "Felipe Gadelha",
        cpf = "",
        password = 1
    )
    val savingsAccount = SavingsAccount(felipe, number = 1000)
    val currentAccount = CurrentAccount(holder = felipe, number = 1001)

    accountsTest()
    println()
    println("Total de contas: ${Account.total}")
}

