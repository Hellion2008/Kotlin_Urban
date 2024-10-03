package modul5.hw8

fun main() {
    println("Задание №1")
    val celebrating = fun (name :String, year: Int): String =
        ("$name, с Новым $year годом тебя!!! Урааааа!!!")
    println(celebrating("Незнакомец", 2024))
    println("--------------------------------------------")

    println("Задание №2")
    val array = arrayOf(2,4,6,8)
    val isEven = fun(num: Int): Boolean = num % 2 == 0
    println("Все ли элементы четные - ${checkArrayElement(array, isEven)}")
    println("--------------------------------------------")

    println("Задание №3")
    val joinLines = fun (str1: String, str2: String): String =
        "$str1 $str2"
    println(joinLines("New", "line!"))
}

fun checkArrayElement(array: Array<Int>, op: (Int) -> Boolean): Boolean{
    for (i in array)
        if(!op(i))
            return false
    return true
}