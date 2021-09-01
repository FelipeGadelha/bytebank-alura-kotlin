package br.com.portfolio.felipe.gadelha.entity

class BonusCalculator {
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {

        println("nome ${employee.name}")
        this.total += employee.bonification
    }
//    fun register(manager: br.com.portfolio.felipe.gadelha.entity.Manager) {
//        this.total += manager.bonification
//    }
//    fun register(director: br.com.portfolio.felipe.gadelha.entity.Director) {
//        this.total += director.bonification
//    }
}