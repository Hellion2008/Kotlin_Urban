package modul7.hw2

fun main() {
    println("Задание №1")
    val str = "New line"
    str.let { println("Строка \"$it\" имеет длину ${it.length} символов") }
    println("-------------------------------------")

    println("Задание №2")
    val city = City("Gotham")
    city.apply { city.population = 1000000 }
    println(city)
    println("-------------------------------------")

    println("Задание №3")
    val arr: Array<Int>? = arrayOf(1,5,2,3,9,7)
//    val arr: Array<Int>? = null
    val info = with(arr){
        if (arr != null)
        "Массив ${arr.contentToString()} \n" +
            "количество элементов - ${arr.size}\n" +
            "сумма элементов - ${arr.sum()}"
        else
            "Нет массива"
    }
    println(info)
}