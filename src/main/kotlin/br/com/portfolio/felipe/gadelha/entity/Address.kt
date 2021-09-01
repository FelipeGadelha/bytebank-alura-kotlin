package br.com.portfolio.felipe.gadelha.entity

class Address(
    var street: String = "",
    var number: Int = 1,
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var zipCode: String = "",
    var complement: String? = null
) {


    override fun toString(): String {
        return """
            Address(street='$street', 
            number=$number, 
            district='$district', 
            city='$city', 
            state='$state', 
            zipCode='$zipCode', 
            complement='$complement')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (street != other.street) return false
        if (number != other.number) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (zipCode != other.zipCode) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = street.hashCode()
        result = 31 * result + number
        result = 31 * result + district.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + zipCode.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }

    fun completo(): String {
        return """"
            |- $street 
            |- $number
            |- $district
            |- $city
            |- $state
            |- $zipCode
            |- $complement
        """.trimMargin()
    }
}
