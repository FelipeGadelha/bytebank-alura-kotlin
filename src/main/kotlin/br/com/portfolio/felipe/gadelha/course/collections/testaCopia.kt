package br.com.portfolio.felipe.gadelha.course.collections

fun testaCopia() {
    val banco = BancoDeNomes()
    banco.salva("felipe")
    val nomesSalvos: Collection<String> = banco.nomes
//    nomesSalvos.add("Paulo")
    banco.salva("Felipe")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}