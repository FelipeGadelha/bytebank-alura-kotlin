package br.com.portfolio.felipe.gadelha.entity

abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
    ) {
    abstract val bonification: Double
}