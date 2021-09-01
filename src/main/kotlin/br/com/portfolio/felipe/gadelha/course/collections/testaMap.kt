package br.com.portfolio.felipe.gadelha.course.collections


fun testaMap() {
    val pedidos = mapOf<Int, Double>(
        Pair(1, 20.0),
        2 to 34.0,
        3 to 50.0
    )
    println(pedidos)
    val pedido: Double? = pedidos[4]
    pedido?.let { println("pedido $it") }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    val pedidosMutavies = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        2 to 34.0,
        3 to 50.0
    )

    pedidosMutavies[4] = 70.0
    println(pedidosMutavies)
    pedidosMutavies.put(5, 80.0)
    println(pedidosMutavies)
    pedidosMutavies[1] = 100.0
    println(pedidosMutavies)
    pedidosMutavies.putIfAbsent(6, 200.0)
    println(pedidosMutavies)
    pedidosMutavies.putIfAbsent(6, 300.0)
    println(pedidosMutavies)
    pedidosMutavies.remove(6)
    println(pedidosMutavies)
    pedidosMutavies.remove(6, 100.0)
    println(pedidosMutavies)
}