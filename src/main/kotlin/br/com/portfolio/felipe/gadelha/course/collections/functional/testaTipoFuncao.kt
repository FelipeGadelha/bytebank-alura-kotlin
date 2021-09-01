package br.com.portfolio.felipe.gadelha.course.collections.functional

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b -> a + b }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
    if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1000.0))
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int { return a + b }

    println(minhaFuncaoAnonima(15, 10))
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
}

fun testaFuncaoTipoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse(10, 10))
}

fun testaFuncaoTipoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma: (Int, Int) -> Int {

    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
//    override fun invoke(p1: Int, p2: Int): Int {
//        return p1 + p2
//    }

}
