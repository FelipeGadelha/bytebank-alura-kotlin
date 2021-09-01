package br.com.portfolio.felipe.gadelha.entity

class Assistent(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonification: Double
        get() = salary * 0.5
}