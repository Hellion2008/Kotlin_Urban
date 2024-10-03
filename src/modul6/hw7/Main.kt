package modul6.hw7

fun main() {
    println("Задание №1")
    val value = "12.3"
    val d = value.toDouble()
    println(d::class.java.simpleName)
    val i = d.toInt()
    println(i::class.java.simpleName)
    val b = Integer.toBinaryString(i)
    println(b)
    println("-------------------------------------------------")

    println("Задание №2")
    println(whatType(13.2))
    println(whatType("13.2"))
    println(whatType(20))
    println(whatType(null))
    println("-------------------------------------------------")

    println("Задание №3")
    doSomething("Работа")
    doSomething(intArrayOf(4,6,7,1,5,4))
    doSomething(5)

}

fun <T> whatType(value : T?): String{
    return when (value){
        is String -> "$value - это строка"
        is Int -> "$value - это целое число"
        is Double -> "$value - это рациональное число"
        is Char -> "$value - это символ"
        null -> "тут ничего нет"
        else -> "неизвестный тип данных"
    }
}

fun <T> doSomething(value:  T){
    when(value){
        is Int -> println(value+1)
        is String -> println(value.length + 1)
        is IntArray -> println(value.sum())
    }
}