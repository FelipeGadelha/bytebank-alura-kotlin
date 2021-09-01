package br.com.portfolio.felipe.gadelha.course.collections.functional

import br.com.portfolio.felipe.gadelha.entity.Address
import br.com.portfolio.felipe.gadelha.entity.Authentication
import br.com.portfolio.felipe.gadelha.entity.InternalSystem

fun testaFuncoesEscopo() {
    //    val address = Address(street = "rua vergueiro", number = 3185)
//    val enderecoMaiusculo = "${address.street}, ${address.number}".uppercase()
//    println(enderecoMaiusculo)

    Address(street = "rua vergueiro", number = 3185).let { endereco ->
        "${endereco.street}, ${endereco.number}".uppercase()
    }.let(::println)

    Address(street = "rua vergueiro", number = 3185)
        .run { "$street, $number".uppercase() }
        .let(::println)

    val address = Address(street = "rua vergueiro", number = 3185)
    with(address) {
        "$street, $number".uppercase()
    }.let { enderecoMaiusculo: String -> println(enderecoMaiusculo) }

    run {
        println("execução do run sem extensão")
    }

    Address()
        .also { println("criando classe de endereço") }
        .apply {
            street = "rua vergueiro apply"
            number = 3185
        }.let(::println)

    listOf(Address(complement = "casa"),
        Address(),
        Address(complement = "apartamento"))
        .filter(predicate = { endereco -> !endereco.complement.isNullOrEmpty() })
        .let(::println)

}
