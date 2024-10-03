package modul4.hw8

class Pyaterochka(name: String, products: Array<String>, countShops: Int) : Shop(name, products, countShops) {
    override fun createSale(sale: Int) {
        println("Сегодня скикда $sale% на весь ассортимент магазина")
    }

    override fun upgradeShop() {
        val randomShop = 1 .. countShops
        println("Происходит переоборудование магазина №${randomShop.random()}")
    }
}