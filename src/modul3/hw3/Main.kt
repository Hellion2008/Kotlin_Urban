package modul3.hw3

fun main() {
    //Task 1
    var x: Int = 4
        if (x > 0)
            x++
    println(x)

    //Task 2
    val a1 = 4
    val a2 = 45
    val a3 = -2
    val a4 = 8
    var positiveNumbers = 0
    if (a1 > 0) positiveNumbers++
    if (a2 > 0) positiveNumbers++
    if (a3 > 0) positiveNumbers++
    if (a4 > 0) positiveNumbers++
    println("Количество положительных чисел: $positiveNumbers")

    //Task 3
    var a = 67
    var b = 98
    if (a == b)
        println(a)
    else if (a < b)
        println(b)
    else println(a)

    //Task 4
    x = 5
    val day: String =
        if (x == 1) "понедельник"
        else if (x == 2) "вторник"
        else if (x == 3) "среда"
        else if (x == 4) "чертверг"
        else if (x == 5) "пятница"
        else if (x == 6) "суббота"
        else if (x == 7) "воскресенье"
        else "нет такого дня"
    println("День недели: $day")

    //Task 5
    var k: Int = 4
    val mark: String =
        if (x == 1) "плохо"
        else if (k == 2) "неудовлетворительно"
        else if (k == 3) "удовлетворительно"
        else if (k == 4) "хорошо"
        else if (k == 5) "отлично"
        else "ошибка"
    println("Твоя оценка - $mark")

    //Task 6
    var number = 4
    var x1 = 6.0
    var x2 = 6.0
    var result =
        if (number == 1) x1 + x2
        else if (number == 2) x1 - x2
        else if (number == 3) x1 * x2
        else if (number == 4) x1 / x2
        else null
    println(result)
}