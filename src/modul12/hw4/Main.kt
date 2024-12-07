package modul12.hw4

import java.io.File

fun main() {
    println("Задание №1")
    val address = "src/modul12/hw4/file.txt"
    writeFile(File(address), "Hello, World, again!\n")
    println("Данные файла: ")
    println(readFile(File(address)))
    println("-------------------------------------")

    println("Задание №2")
    val nameFile = "task2.txt"
    val path = "src/modul12/hw4/"
    val number = 10
    val file = File(path + nameFile)
    for (i in 2..number step 2){
        if (file.exists())
            file.appendText(" $i")
        else
            file.writeText("$i")
    }
    println("-------------------------------------")

    println("Задание №3")
    val someFile = File("src/modul12/hw4/task2.txt")
    val textFile = someFile.readText().trim()
    val someText = textFile.split(" ")
    val maxElements = 4
    if (someText.size > maxElements)
        println("Первый: ${someText[0]}\nВторой: ${someText[1]}\n" +
            "Предпоследний: ${someText[someText.size-2]}\nПоследний: ${someText[someText.size-1]}")
    else
        println("Мало элементов")
    println("-------------------------------------")

}

fun readFile(address: File): String{
    return if (address.exists())
        address.readText()
    else
        "Файл не найден"
}

fun writeFile(file: File, text: String){
    return if (file.exists())
        file.appendText(text)
    else
        file.writeText(text)
}