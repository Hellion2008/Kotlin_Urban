package modul12.hw5

abstract class Shop(val name: String, val city: String) {

    val countPhones: MutableMap<Phone, Int> = mutableMapOf()

    fun sellProduct(namePhone: Phone){
        if (this.countPhones.containsKey(namePhone)){
            var value = this.countPhones.getValue(namePhone)
            this.countPhones.replace(namePhone, --value)
            this.purchaseMessage()
        } else{
            println("Такого телефона в продаже нет, уточните у консультантов")
        }
    }

    abstract fun purchaseMessage()

    override fun toString(): String {
        return "Магазин из города $city"
    }
}