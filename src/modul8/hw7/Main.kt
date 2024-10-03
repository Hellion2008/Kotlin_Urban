package modul8.hw7

import kotlin.streams.toList

fun main(){
    println("Task 1")
    val list1 = (1..20).toList()
    println(list1.drop(4).count(){it % 2 == 0})
    println("------------------------------------")

    println("Task 2")
    println(list1.take(7).sum())
    println("------------------------------------")

    println("Task 3")
    val numbers = listOf("one", "two", "three")
    println(numbers.map { it.toCharArray().toList() }.flatten())
    println("------------------------------------")

    println("Task 4")
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
//    println(fruits.maxBy{it.length})
    println("------------------------------------")

    println("Task 5")

    data class Product (val name: String, var capacity: Int){
        override fun toString() = "$name - $capacity"
    }

    val products = listOf(
        Product("Milk", 150),
        Product("Water", 100),
        Product("Juice", 130),
        Product("Mineral water", 117),
        Product("Coffee", 120)
    )

    println(products.map{it.capacity}.fold(0, {a,b -> a+b}))

}