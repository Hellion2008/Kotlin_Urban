package modul3.hw7

fun main() {
    //Task1
    val n = 5
    var sum = 0.0
    for (i in 1..n){
        sum += 1.0 / i
    }
    println("Сумма: $sum")
    println("----------------------------------------------")
    //Task2
    val a = 5
    val b = 10
    var sum2 = 0
    for (i in a..b){
        sum2 += i * i
    }
    println("Сумма квадратов от $a до $b: $sum2")
    println("----------------------------------------------")
    //Task3
    for (i in a..b){
        repeat(i - a + 1){
            print("$i ")
        }
    }
    println("\n----------------------------------------------")
    //Task4
    val number = 5
    var isNotSimple = true
    for (i in 2..<number){
        if (number % i == 0){
            isNotSimple = false
            break
        }
    }
    val result = if (isNotSimple) "Число $number простое" else "Число $number не является простым"
    println(result)
    println("----------------------------------------------")
    //Task5
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    val tries = 3
    for (i in 1..tries){
        var guess = readln()
        var answer = when(guess.lowercase()){
            "троллейбус" -> {
                println("Правильно!")
                break
            }
            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                break
            }
            else -> {
                if (i < tries) println("Подумай еще.")
                else println("Ты проиграл...")
            }
        }

    }
}