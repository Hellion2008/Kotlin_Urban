package modul12.hw5

abstract class Shop(val name: String, val city: String) {

    val countPhones: MutableMap<Phone, Int> = mutableMapOf()

    override fun toString(): String {
        return "Магазин из города $city"
    }
}