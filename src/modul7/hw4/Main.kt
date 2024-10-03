package modul7.hw4

fun main() {
    val list = arrayListOf(1,5,6,7,2,1,9,3)

    println("Первый элемент: ${list.get(0)} - ${list.first()}")

    var average = 0.0
    for(el in list)
        average += el.toDouble()
    average /= list.size
    println("Среднее значение: ${list.average()} - $average")

    var sum = 0
    for (el in list)
        sum += el
    println("Сумма элементов: ${list.sum()} - $sum")

    var counter = 0
    for (el in list)
        counter++
    println("Количество элементов: ${list.count()} - $counter")

    sum = 0
    for(i in 1..2)
        sum += list.get(list.size - i)
    println("Сумма 2-х последних элементов: $sum - " +
            "${list.takeLast(2).sum()}")
    sum = 0
    for (i in 0..<list.size)
        sum += i
    println("Сумма индексов: $sum - ${list.indices.sum()}")
}