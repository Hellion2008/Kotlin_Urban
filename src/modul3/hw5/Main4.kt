package modul3.hw5

fun main() {
    //Task1
    println("Введи число для вычисления факториала: ")
    var factorial = 1
    var i = 1
    val x1: Int = readln().toInt()
    while(i <= x1){
        factorial *= i++
    }
    println(factorial)
    println("----------------------------------")
    //Task2
    val candyCount = 10
    println("Введите цену за 1кг конфет: ")
    val price = readln().toDouble()
    i = 0
    while (i < candyCount){
        println("Цена за ${++i}кг конфет: ${i * price}")
    }
    println("----------------------------------")
    //Task3
    var a = 30
    val b = 45
    var countNumbers = 0;
    while (a <= b){
        print("${a++} ")
        countNumbers++
    }
    println("\nКоличество чисел - $countNumbers")
    println("----------------------------------")
    //Task4
    var n = 546
    var x4 = 1
    while (n > 0){
        var ost = n % 10
        print("$ost ")
        n /= 10
        x4++
    }
    println()
    println("----------------------------------")
    //Task5
    var x5 = 1
    val y5 = 20
    while (x5 <= y5){
        when{
            x5 % 2 == 0 && x5 % 4 == 0 -> println("x2: ${x5 * 2}")
            x5 % 2 == 0 -> println(x5)
            x5 == 19 -> break
        }
        x5++
    }
    println("----------------------------------")
    //Task6
    var month = 9
    var bank: Double = 350.0
    val percent = 1.07
    while (month > 0){
        bank *= percent
        month--
    }
    println("Сумма: ${String.format("%.2f", bank)} тугриков")


}