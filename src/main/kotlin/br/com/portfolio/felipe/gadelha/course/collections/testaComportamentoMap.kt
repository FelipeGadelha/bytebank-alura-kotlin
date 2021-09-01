package br.com.portfolio.felipe.gadelha.course.collections

fun testaComportamentoMap() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        2 to 34.0,
        3 to 50.0,
        4 to 150.0,
        5 to 100.0,
        6 to 200.0,
        7 to 20.0
    )
//    println(pedidos.getValue(0))
//    println(pedidos.get(0))
    println(pedidos.getOrElse(0) { "Não tem o pedido" })
    println(pedidos.getOrElse(0, { "Não tem o pedido" }))
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    val keys: Set<Int> = pedidos.keys
    println(keys)
    println(pedidos.keys)
    println(pedidos.values)

    val filter = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    val filterKeys = pedidos.filterKeys { numero -> numero % 2 == 0 }
    val filterValues = pedidos.filterValues { valor -> valor > 70.0 }
    println(filter)

    println(filterKeys)
    println(filterValues)

    println(pedidos + mapOf(7 to 90.0, 8 to 100.0))
    println(pedidos - 6)
    println(pedidos - listOf(6, 7))

    pedidos.putAll(listOf(Pair(4, 50.0), 4 to 40.0))
    pedidos += listOf(Pair(4, 50.0), 4 to 40.0)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
