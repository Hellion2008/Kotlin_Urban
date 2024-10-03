package modul4.hw10

fun main() {
    println("Задание №1")
    val bird = Bird("Курица")
    bird.fly()

    val ostrich = Ostrich("Страус")
    ostrich.fly()

    val eagle = Eagle("Орел")
    eagle.fly()
    println("---------------------------------")

    println("Задание №2")
    val array = arrayOf("Hello", "lunch", "information", "robot", "urban")
    println("Самое длинное слово в массиве: ${findLongWord(array)}")
    println("---------------------------------")

    println("Задание №3")
    val str = "ПриВет, кАк деЛа"
    println("Количество заглавных букв в строке: ${countUppercase(str)}")

}

fun findLongWord(array: Array<String>): String{
    var result = ""
    for (str in array){
        result = if (str.length > result.length) str else result
    }
    return result
}

fun countUppercase(str: String): Int{
    var counter = 0
    for (i in 0..<str.length){
        if (str[i].isUpperCase()){
            print("${str[i]} ")
            counter++
        }
    }
    println()
    return counter
}