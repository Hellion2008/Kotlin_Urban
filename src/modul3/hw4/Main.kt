package modul3.hw4

fun main() {
    //task1
    val number = 2
    val month = when(number){
        1 -> "Январь"
        2 -> "Февраль"
        3 -> "Март"
        4 -> "Апрель"
        5 -> "Май"
        6 -> "Июнь"
        7 -> "Июль"
        8 -> "Август"
        9 -> "Сентябрь"
        10 -> "Октябрь"
        11 -> "Ноябрь"
        12 -> "Декабрь"
        else -> "Нет такого месяца"
    }
    val season = when(number){
        1, 2, 12 -> ". Зима"
        in 3..5 -> ". Весна"
        in 6..8 -> ". Лето"
        in 9..11 -> ". Осень"
        else -> " и времени года"
    }
    println("$month$season")

    //Task 2
    var x: Double = 4.5
    //println(x.roundToInt())
    var ost: Double = x % 1
    when {
        (ost < 0.5) -> x -= ost
        else -> x += (1 - ost)
    }
    println(x)

    //Task 3
    val time = 25
    var dayTime = when (time){
        in 0..5 -> "Раннее утро"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..20 -> "Вечер"
        in 21.. 23 -> "Поздний вечер"
        else -> "ты на другой планете"
    }
    println("Время ${time}ч, а значит сейчас $dayTime")

    //Task 4
    var a = 8
    var b = 5
    println("Было: a = $a, b = $b")

    a += b //13
    b = a - b //8
    a -= b //5
    println("Стало: a = $a, b = $b")
}