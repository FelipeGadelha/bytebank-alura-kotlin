import br.com.portfolio.felipe.gadelha.entity.*

fun employeeTest() {
    println("Ola mundo")

    val felipe = Analyst(
        name = "Felipe Gadelha",
        cpf = "111.111.123.43",
        salary = 2500.0
    )

    val isabella = Manager(
        name = "Isabella Monteiro",
        cpf = "111.111.123.42",
        salary = 5000.0,
        password = 1234

    )
    val director = Director(
        name = "Director Monteiro",
        cpf = "111.111.123.42",
        salary = 10000.0,
        password = 1234,
        plr = 3.0
    )
    println("nome : ${isabella.name}")
    println("cpf : ${isabella.cpf}")
    println("salario : ${isabella.salary}")
    println("bonificação : ${isabella.bonification}")
    if (isabella.autenticate(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
    println()

    var maria: Analyst = Analyst(
        name = "maria",
        cpf = "123.123.545-56",
        salary = 4000.0
    )

    println("nome : ${maria.name}")
    println("cpf : ${maria.cpf}")
    println("salario : ${maria.salary}")
    println("bonificação : ${maria.bonification}")

    println("nome : ${felipe.name}")
    println("cpf : ${felipe.cpf}")
    println("salario : ${felipe.salary}")
    println("bonificação : ${felipe.bonification}")

    println()

    println("nome : ${director.name}")
    println("cpf : ${director.cpf}")
    println("salario : ${director.salary}")
    println("bonificação : ${director.plr}")
    println("bonificação : ${director.bonification}")

    println()

    val calculator = BonusCalculator()
    calculator.register(felipe)
    calculator.register(isabella)
    calculator.register(director)
    calculator.register(maria)

    println("total de bonificação ${calculator.total}")


    val internalSystem = InternalSystem()
    internalSystem.enter(director, 1234)
    internalSystem.enter(isabella, 1234)

}
