package modul12.hw5

abstract class Phone(val name: String, val color: String, var price: Double) {
    override fun toString(): String {
        return "$name($color) - $price"
    }
}