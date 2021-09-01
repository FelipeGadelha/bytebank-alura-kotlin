package br.com.portfolio.felipe.gadelha.entity

class InternalSystem {

    fun enter(manager: Authentication, password: Int, autheticate: () -> Unit = {}) {
        if (manager.authenticate(password)) {
            println("Bem vindo ao Bytebank")
            autheticate()
        } else{
            println("Falha na autenticação")
        }
    }
    fun enterReceiver(manager: Authentication, password: Int, autheticate: InternalSystem.() -> Unit = {}) {
        if (manager.authenticate(password)) {
            println("Bem vindo ao Bytebank")
            autheticate(this)
        } else{
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("realizando pagamento")
    }
}