package br.com.portfolio.felipe.gadelha.entity

class Client(
    val name: String,
    val cpf: String,
    var address: Address = Address(),
    private val password: Int
) : Authentication {

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) return true
        return false
    }

}