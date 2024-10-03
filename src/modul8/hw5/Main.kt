package modul8.hw5

fun main(){
    println("Task №1")
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    println(list1.subList(3,10).sum())
    println("--------------------------------------------")

    println("Task №2")
    val numbers = listOf(1, 2, 3, 4)
    println(numbers.joinToString(""))
    println("--------------------------------------------")

    println("Task №3")
    data class Player(val name:String, var points: Int, var money: Int){
        override fun toString() = "$name ($points - $money)"
    }

    val players = listOf(
        Player("C. Ronaldo", 253, 1500550),
        Player("D. Beckham", 153, 1500550),
        Player("Z. Zidane", 208, 1500550),
        Player("Kaka", 123, 1500550),
        Player("Arg", 171, 1500550),
    )

    var resultMoney = players.sumBy{it.money}
    var resultPoints = players.sumBy{it.points}
    println("Общее количество очков - $resultPoints, заработанных денег - ${resultMoney}")
    println("--------------------------------------------")

    println("Task №4")
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    println(fruits
        .groupBy { it.first().lowercase() }
        .mapValues { l -> l.value.filter { it.length % 2 == 0 } }
    )
}