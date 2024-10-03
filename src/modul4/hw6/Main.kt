package modul4.hw6

fun main() {
    println("Задание №1")
    var bankCard = BankCard(123456, 789, "ok")
    bankCard.showInfo("ok")
    println("-------------------------------")

    println("Задание №2")
    val a = 52
    println("Если а = $a, то результатом будет ${calculate(a)}")
    println("-------------------------------")

    println("Задание №3")
    val x = 123456789
    println("Перевернутое число $x: ${reverseNumber(x)}")
}

fun calculate(a: Int): Int{
    var temp = a
    temp += 7
    temp -= 4
    temp *= 2
    temp %= 3
    return temp
}

fun reverseNumber(num: Int) :Int{
    var temp = num
    var result = ""
    while (temp > 0 ){
        result += "${ temp % 10 }"
        temp /= 10
    }
    return result.toInt()
}