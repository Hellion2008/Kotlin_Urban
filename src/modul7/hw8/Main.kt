package modul7.hw8

fun main() {
    val list = listOf("первый", "слово", "автомобиль", "самолет", "Москва", "стройка")
    println(list.groupBy { it[0] }.toSortedMap())
    println(list.groupBy { it.length }.toSortedMap())

    val phoneToYear = listOf(
        "NexusOne" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )

    println(phoneToYear.groupBy { k -> k.second })

}