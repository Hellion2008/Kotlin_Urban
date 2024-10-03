package modul4.hw8

abstract class Shop (val name: String,
                     var products: Array<String>,
                     var countShops: Int) {

    abstract fun createSale(sale: Int)
    abstract fun upgradeShop()

    open fun work(){
        println("Работники магазина работают в обычном режиме. Нас целых $countShops магазинов")
    }
}