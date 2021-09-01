package br.com.portfolio.felipe.gadelha.course.collections.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.imprimeComMarcadores()

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    println()
    livros.forEach { println(it) }
    println()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    println()

    val ordenadoPeloNomeDoAutor = livros.sortedBy { it.autor }

    ordenadoPeloNomeDoAutor.imprimeComMarcadores()
    println()

    livros.filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.titulo }
        .imprimeComMarcadores()

    println()
    livros.filter { it.autor.startsWith("João") }
        .sortedBy { it.titulo }
        .map { it.titulo }
        .forEach { println(it) }














}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("############## Lista de Livros ################ \n$textoFormatado")
}