package modul12.hw5

class TechnologiesShop(name: String = "Телефончики", city: String) : Shop(name, city) {
    override fun purchaseMessage() {
        println("Телефон куплен, осталось еще много телефонов")
    }
}