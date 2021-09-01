package br.com.portfolio.felipe.gadelha.entity

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonification: Double get() {
        println("Bonificação analista")
        return salary * 0.1
    }

}