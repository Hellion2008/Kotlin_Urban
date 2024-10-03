package modul4.hw8

class Magnit(name: String, products: Array<String>, countShops: Int) : Shop(name, products, countShops) {
    override fun createSale(sale: Int) {
        println("С сегодняшнего дня всю неделю скидка $sale% на продукт: ${products.random()}")
    }

    override fun upgradeShop() {
        println("Объявляем, что на следующей недели начнется обучение персонала новым функциям")
    }
}