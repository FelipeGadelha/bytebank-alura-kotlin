package br.com.portfolio.felipe.gadelha.entity

abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int
    ): Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authentication {

    open fun autenticate(password: Int): Boolean {
        if (this.password == password) return true
        return false
    }

}