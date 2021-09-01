package br.com.portfolio.felipe.gadelha.course.collections.functional

import br.com.portfolio.felipe.gadelha.entity.Authentication
import br.com.portfolio.felipe.gadelha.entity.InternalSystem

fun testaHOF(){
    soma(1, 5, resultado = { println(it) })
    soma(1, 5, resultado = { valor -> println(valor) })

    somaReceiver(1, 5, resultado = (::println))
    somaReceiver(1, 5, resultado = { println(this)})

    val autenticavel = object : Authentication {
        val senha = 1234
        override fun authenticate(password: Int): Boolean = this.senha == password
    }

    val sistema = InternalSystem()
    sistema.enter(autenticavel, 1234, autheticate = {
        println("realizar pagamento")
    })
    sistema.enterReceiver(autenticavel, 1234, autheticate = {
        pagamento()
    })


}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}