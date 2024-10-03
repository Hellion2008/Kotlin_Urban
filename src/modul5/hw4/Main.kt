package modul5.hw4

fun main() {
    println("Задание №1")
    val array = arrayOf("Шумоизоляция", "Парогенератор", "Локомотив", "СамоеДлинноеСлово")
    println("Самое длинное слово массива: ${findLongest(array)} (${findLongest(array)?.length})")
    println("---------------------------------------------------------")

    println("Задание №2")
    val matrix = arrayOf(
        arrayOf(1,2,3, 10),
        arrayOf(4,5,6, 11),
        arrayOf(7,8,9, 12),
        arrayOf(7,8,9, 12)
    )
    println(sumDiagonal(matrix))
    println("---------------------------------------------------------")

    println("Задание №3")
    val printer1 = object : Printer() {
        override fun print() {
            println("Что-то печатает в консоль")
        }
    }
    printer1.print()

    val printer2 = object : Printer("Somebody"){
        override fun print() {
            println("Hello, $name!")
        }
    }
    printer2.print()
}

fun findLongest(array: Array<String>): String?{
    return array.maxByOrNull { s: String -> s.length }
}

fun sumDiagonal(matrix: Array<Array<Int>>): Int{
    var sum = 0
    for (i in 0..<matrix.size){
        sum += matrix[i][matrix[i].size - 1 - i]
    }
    return sum
}