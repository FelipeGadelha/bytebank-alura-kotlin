package br.com.portfolio.felipe.gadelha.teste

import br.com.portfolio.felipe.gadelha.exception.InsufficientFundsException

fun main() {
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: InsufficientFundsException){
        e.printStackTrace()
        println("SalodoInsuficienteException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val address = Any()
        throw InsufficientFundsException()
    }
    println("fim funcao2")
}
