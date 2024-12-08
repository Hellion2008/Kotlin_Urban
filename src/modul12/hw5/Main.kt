package modul12.hw5

fun main() {
    println("Сеть магазинов по продаже телефонов")

    val shopOne = TechnologiesShop(city = "Москва")
    val shopTwo = TechnologiesShop(city = "Ижевск")

    shopOne.countPhones.putAll(mapOf(
        Iphone("Iphone", "Черный", 120000.0) to 100,
        Xiaomi("Xiaomi 14T", "Черный", 55000.0) to 200,
        Samsung("Samsung S10", "Белый", 55000.0) to 150
    ))

    shopTwo.countPhones.putAll(mapOf(
        Iphone("Iphone", "Белый", 110000.0) to 50,
        Iphone("Iphone", "Черный", 150000.0) to 150,
        Samsung("Samsung S10", "Белый", 50000.0) to 130,
        Xiaomi("Xiaomi 12T", "Желтый", 25000.0) to 200,
        Samsung("Samsung S12", "Черный", 45000.0) to 150
    ))


}