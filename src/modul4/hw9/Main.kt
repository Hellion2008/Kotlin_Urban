package modul4.hw9

fun main() {
    println("Задание №2")
    val a = 175
    val b = 85
    println ("НОД чисел $a и $b: ${findNOD(a,b)}")
    println("------------------------------------------------------------------")
    println("Задание №3")
    val array = arrayOf(45,87,893, 98,56,4,123,0)
    println("Второе максимальное число в последовательнгости: ${getSecondMax(array)}")
}

fun getSecondMax(array: Array<Int>): Int{
    var max = Int.MIN_VALUE + 1
    var secondMax = Int.MIN_VALUE
    for (el in array){
        if (el > max){
            secondMax = max
            max = el
        } else if (el > secondMax)
            secondMax = el
    }
    return secondMax
}

fun findNOD(a: Int, b: Int): Int{
    var x = a
    var y = b
    while (x > 0 && y > 0){
        if (x > y)
            x %= y
        else
            y %= x
    }
    return if (x == 0) y else x
}