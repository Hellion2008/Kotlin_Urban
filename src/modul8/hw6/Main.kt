package modul8.hw6

fun main() {
    println("Task 1")
    val list1 = listOf("one", "two", "three")
    println(list1.map { it.reversed() })
    println("--------------------------------------------")

    println("Task 2")
    val list2 = listOf(1, 2, 3, 4, 5)
    println(list2.filter { it <= 3 }.map { it * it })
    println("--------------------------------------------")

    println("Task 3")
    val colorsEng = listOf("red", "blue", "white")
    val colorsRus = listOf("красный", "синий", "белый")
    println(colorsEng.zip(colorsRus){eng, rus ->
        "Значение: $eng, перевод: $rus"
    })
    println("--------------------------------------------")

    println("Task 4")
    val months = listOf("Jan", "Feb", "Mar", "Apr", "May")
    println(months.map { it.length }.sum())

}