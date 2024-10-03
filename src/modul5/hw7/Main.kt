package modul5.hw7

fun main() {
    println("Задание №1")
    val color1 = "зеленый"
    val color2 = "красный"
    println(action(color1, color2, ::mixColors))
    println("-------------------------------------------")

    println("Задание №2")
    val array = arrayOf(1,2,3,4,5,6,7,8,9)
    println(actionArray(array,::plusOne))
    println(actionArray(array,::doubleMult))
}

fun action (color1 : String,
            color2: String,
            op: (String, String) -> String): String
= "Смешивая $color1 цвет с $color2 получется ${op(color1, color2)}"

fun mixColors(color1: String, color2: String): String{
    val result = when{
        color1 == color2 -> color1
        color1 == Colors.RED.color && color2 == Colors.YELLOW.color -> "оранжевый"
        color1 == Colors.YELLOW.color && color2 == Colors.BLUE.color -> "салатовый"
        color1 == Colors.BLUE.color && color2 == Colors.RED.color -> "фиолетовый"
        color1 == Colors.GREEN.color && color2 == Colors.RED.color -> "коричневый"
        else -> "серо-буро-малиновый"
    }
    return result
}

fun plusOne (number: Int) : Int = number + 1
fun doubleMult (number: Int) : Int = number * 2

fun actionArray(array: Array<Int>, op: (Int) -> Int): List<Int> =
    array.map{op(it)}

enum class Colors(val color: String){
    RED("красный"),
    GREEN("зеленый"),
    BLUE("синий"),
    YELLOW("желтый")
}