package br.com.portfolio.felipe.gadelha.entity

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : EmployeeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
)
{
    override val bonification: Double get() = salary + plr
    override fun authenticate(password: Int): Boolean {
        if (this.password == password) return true
        return false
    }
}