import br.com.portfolio.felipe.gadelha.entity.Address
import br.com.portfolio.felipe.gadelha.exception.InsufficientFundsException
import br.com.portfolio.felipe.gadelha.teste.accountsTest

fun main() {
    var addressNull: Address? = Address(street = "rua vergueiro", complement = "prédio")
    val Street: String? = addressNull?.street
    println(addressNull?.street?.length)
    addressNull?.let { address: Address ->
        println(address.street.length)
        val lengthComplement: Int =
            address.complement?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(lengthComplement)
    }
}
