package modul6.hw2

fun main() {
    println("Задание №1")
    val str = "Занятие"
    for (i in str.indices)
        print("${str.get(i)} ")
    println()
    println("------------------------------------------")

    println("Задание №2")
    var number = "+71234567890"
    val checkPhoneNumber = {str: String ->
        str.trim()
        if (str.substring(0, 2) == "+7"
            && str.length == 12
            && str.contains("[0-9]".toRegex()))
            true
        else
            false
    }
    println("Это телефонный номер? - ${checkPhoneNumber(number)}")
    println("------------------------------------------")

    println("Задание №3")
    println("Эта строка".reversed())
    println("------------------------------------------")

    println("Задание №4")
    var counter = 0
    val kot = "kotlin2023course"
    kot.forEach { it ->
        if(it.isDigit())
            counter++
    }
    println(counter)
}