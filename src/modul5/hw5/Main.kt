package modul5.hw5

import kotlin.math.pow

fun main() {
    println("Задание №1")
    println(tenToTwo(375))
    println("------------------------------------")

    println("Задание №2")
    println(twoToTen("101110111"))
    println("------------------------------------")

    println("Задание №3")
    val word = "довод"
    print("Слово \"$word\" палиндром - ${isPalindrom(word)}")

}

fun tenToTwo(num: Int): String{
    var result = ""
    var temp = num
    while(temp > 0){
        result = (temp % 2).toString() + result
        temp /= 2
    }
    return result
}

fun twoToTen(str: String): Int{
    var result = 0
    for(i in 0..<str.length){
        result += str[str.length - 1 - i].digitToInt() * 2.0.pow(i.toDouble()).toInt()
    }
    return result
}

fun isPalindrom(str: String): Boolean{
    for(i in 0..<str.length/2){
        if(str[i] != str[str.length - 1 - i])
            return false
    }
    return true
}