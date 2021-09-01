package br.com.portfolio.felipe.gadelha.course.collections.functional

import br.com.portfolio.felipe.gadelha.entity.*


fun main() {
    testaHOF()

}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")


    val savingsAccount =
        SavingsAccount(holder = Client(name = "Alex", cpf = "111.111.111-11", password = 1234), number = 1000)

    savingsAccount.run {
        deposit(1000.0)
        balance * taxaMensal
    }.let { rendimentoMensal -> println("rendimento mensal $rendimentoMensal") }

    val rendimentoAnual = run {
        var saldo = savingsAccount.balance
        repeat(12) { indice -> saldo += saldo * taxaMensal }
        saldo
    }
    println("simulação rendimento anual $rendimentoAnual")
}

fun testaWith() {
    val enderecoCompleto = with(Address()) {
        street = "rua vergueiro"
        number = 3185
        district = "Vila Mariana"
        city = "São Paulo"
        state = "SP"
        zipCode = "02310-063"
        complement = "Apartamento"
        completo()
    }
    println(enderecoCompleto)

    with(Address()) {
        street = "rua vergueiro"
        number = 3185
        district = "Vila Mariana"
        city = "São Paulo"
        state = "SP"
        zipCode = "02310-063"
        complement = "Apartamento"
        completo()
    }.let { enderecoCompleto -> println(enderecoCompleto) }
}


