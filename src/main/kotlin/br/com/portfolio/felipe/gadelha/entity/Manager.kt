package br.com.portfolio.felipe.gadelha.entity

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : EmployeeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {

    override val bonification: Double get() {
        println("Bonificação gerente")
        return salary * 0.2 + salary
    }

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) return true
        return false
    }


    override fun autenticate(password: Int): Boolean {
        if (this.password == password) return true
        return false
    }
}