package br.com.portfolio.felipe.gadelha.teste

fun expressionTest() {
    println("início main")

    val entrada: String = "1,9"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) valorRecebido + 0.1 else null

    if (valorRecebido != null) {
        println("valor recebido: $valorRecebido")
    } else {
        println("calor inválido")
    }
}
