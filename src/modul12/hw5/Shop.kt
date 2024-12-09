package modul12.hw5

abstract class Shop(val name: String, val city: String) {

    val countPhones: MutableMap<Phone, Int> = mutableMapOf()
    val soldPhones: MutableMap<Phone, Int> = mutableMapOf()

    fun sellProduct(namePhone: Phone){
        if (this.countPhones.containsKey(namePhone)){
            var value = this.countPhones.getValue(namePhone)
            this.countPhones.replace(namePhone, --value)

            this.purchaseMessage(namePhone.toString(), value)
            addToSoldList(namePhone)
        } else{
            println("Такого телефона в продаже нет, уточните у консультантов")
        }
    }

    private fun addToSoldList(namePhone: Phone) {
        if (soldPhones.containsKey(namePhone)) {
            var countSoldPhone = soldPhones.getValue(namePhone)
            soldPhones.replace(namePhone, ++countSoldPhone)
        } else {
            soldPhones.put(namePhone, 1)
        }
    }

    fun showStatistics(){
        println("Продано")
        for (phone in soldPhones)
            println("${phone.key} - ${phone.value} шт.")
        println("Общая сумма продаж: ${soldPhones.keys.sumOf { it.price }} руб.")
        println("----------------------------------------------")
    }

    protected abstract fun purchaseMessage(namePhone: String, count: Int)

    override fun toString(): String {
        return "Магазин из города $city"
    }
}