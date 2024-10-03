package modul4.hw1

fun main() {
    raisingNumber(2,5)
    multiplying(2,5)
    maxDenominator(321,54)
}

//Task1
fun raisingNumber (a: Int, n: Int){
    var res = a
    for (i in 1..<n)
        res *= a
    println("Число $a в степени $n: $res")
}

//Task2
fun multiplying(a: Int, b: Int){
    var res = 1
    for (i in a..b){
        res *= i
    }
    println("Произведение чисел от $a до $b : $res")
}

fun maxDenominator (a: Int, b: Int){
    var res = 0
    for (i in b downTo 1){
        if (a % i == 0 && b % i == 0){
            res = i
            break
        }
    }
    println("Наибольший общий делитель чисел $a и $b: $res")
}