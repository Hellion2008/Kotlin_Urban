package modul4.hw3

fun main() {
    val helicopter = Helicopter()
    helicopter.name = "Черная акула"
    helicopter.speed = 300.0
    helicopter.beginWeight = 10800.0
    helicopter.maxHeight = 5500.0
    println("Спроектировали $helicopter")
    println("------------------------------------")

    val cat = Animal()
    cat.name = "Барсик"
    cat.type = "кот"
    cat.weight = 10.5
    println(cat)
    println("------------------------------------")

    println(roundNumber(5.87))
}

fun roundNumber(num: Double): Int{
    var ost: Double = num % 1
    var result = 0
    when {
        (ost < 0.5) -> result = (num - ost).toInt()
        else -> result = (num + 1 - ost).toInt()
    }
    return result
}