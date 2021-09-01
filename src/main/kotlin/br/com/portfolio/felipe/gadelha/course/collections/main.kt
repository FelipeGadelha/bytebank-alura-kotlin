package br.com.portfolio.felipe.gadelha.course.collections

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(2, 60.0)])

//    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//
//    println(mapa)
    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[false])

    val nomes = listOf(
        "Felipe",
        "Alex",
        "Ana",
        "Gui",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda = nomes.groupBy { nome -> nome.first() }
    println("teste" + agenda)

}


data class Pedido(val numero: Int, val valor: Double)
