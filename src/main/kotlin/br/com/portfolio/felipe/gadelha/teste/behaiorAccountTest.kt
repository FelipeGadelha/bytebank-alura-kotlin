import br.com.portfolio.felipe.gadelha.entity.Address
import br.com.portfolio.felipe.gadelha.entity.Client
import br.com.portfolio.felipe.gadelha.entity.CurrentAccount
import br.com.portfolio.felipe.gadelha.entity.SavingsAccount

fun behaiorAccountTest (){
    val accountFelipe = SavingsAccount(Client(
        name = "Felipe Gadelha",
        cpf = "213.321.345-76",
        password = 12,
        address = Address(
            street = "Rua dos bobos"
        )
    ), 12131)
    val accountIsabella = CurrentAccount(Client(
        name = "Isabella Monteiro",
        cpf = "987.987.657-65",
        password = 10,
    ), 565754)
    println(accountFelipe.holder)
    accountFelipe.deposit(70.0)
    println(accountFelipe.balance)
    println("sacando na conta do Felipe")
    accountFelipe.withdraw(10.0)
    accountFelipe.deposit(-100.0)
    println(accountFelipe.balance)
    println()
}