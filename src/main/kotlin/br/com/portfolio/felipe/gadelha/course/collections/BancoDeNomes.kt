package br.com.portfolio.felipe.gadelha.course.collections

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    companion object {
        private val dados = mutableListOf<String>()
    }

    fun salva(nome: String) {
        dados.add(nome)
    }

}
