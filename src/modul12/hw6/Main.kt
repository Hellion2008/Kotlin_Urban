package modul12.hw6

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    println("Кофе-машина")
    selectedMenu()
}

sealed class Coffee(val sugar: Int, val capacity: Double){
    class Americano(sugar: Int, capacity: Double): Coffee(sugar, capacity)
    class Cappuccino(sugar: Int, capacity: Double, val milk: Double): Coffee(sugar, capacity)
    class Latte(sugar: Int, capacity: Double): Coffee(sugar,capacity)
}

suspend fun selectedMenu(){
    println("Выберите кофе:")
    println("1: Americano\n2: Cappuccino\n3: Latte")
    val choice = readln().toInt()
    println("Количество сахара: ")
    val sugar = readln().toInt()
    println("Объем кофе: ")
    val capacity = readln().toDouble()
    var milk: Double? = null
    if (choice == 2){
        println("количество молока: ")
        milk = readln().toDouble()
    }
    val coffee = when(choice){
        1 -> Coffee.Americano(sugar, capacity)
        2 -> Coffee.Cappuccino(sugar, capacity, milk!!)
        3 -> Coffee.Latte(sugar, capacity)
        else -> null
    }
    makingCoffee(coffee!!)
}

suspend private fun makingCoffee(coffee: Coffee){
    loading()
    var message = "Ваш кофе готов: ${coffee::class.java.simpleName}, сахар: ${coffee.sugar}, объем: ${coffee.capacity}"
    when (coffee){
        is Coffee.Cappuccino ->
            println(message + " молоко: ${coffee.milk}")
        else -> println(message)
    }

}

private suspend fun loading() {
    var counter = 0
    println("Идет приготовление: ")
    coroutineScope {
        launch {
            repeat(10) {
                delay(500L)
                counter += 10
                print("$counter% ")
            }
            println()
        }
    }
}