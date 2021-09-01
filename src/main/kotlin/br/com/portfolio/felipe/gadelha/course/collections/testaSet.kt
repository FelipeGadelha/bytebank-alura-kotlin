package br.com.portfolio.felipe.gadelha.course.collections

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos: MutableSet<String> = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Gui")
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union (assistiramCursoKotlin))

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList: MutableList<String> = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}
