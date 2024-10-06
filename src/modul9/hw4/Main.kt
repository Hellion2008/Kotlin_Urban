package modul9.hw4

import kotlinx.coroutines.*
import kotlin.system.exitProcess

suspend fun main() = coroutineScope<Unit>{

    val personList = listOf(
        Person("Bruce", 35000),
        Person("Peter", 28000),
        Person("Kaneki", 18000),
        Person("Tony", 41000),
        Person("Leo", 25000),
        Person("Don", 56000),
        Person("Mick", 45000),
        Person("Raph", 15000),
        Person("Splinter", 25000)
    )
    val personManager = PersonManager()
    personManager.setPersonList(personList.toMutableList())

    println("Программа работы с базой данных сотрудников")
    delay(1000L)
    println("Добавить сотрудника:\n1.Да\n2.Нет")
    while (true){
        var choise = readln().toInt()
        when(choise){
            1 -> {
                val temp = readln().split(" ")
                personManager.addPerson(Person(temp[0],temp[1].toInt()))
                println("Добавить сотрудника:\n1.Да\n2.Прочитать базу данных")
            }
            2 -> break
            else -> println("Неверные данные")
        }
    }

    val dataBase = launch(start = CoroutineStart.LAZY) {
        personManager.addPassword()
        personManager.readDataPersonList()
        exitProcess(0)
    }

    val exitForm = launch (start = CoroutineStart.LAZY){
        exitFromProgram()
    }

    dataBase.start()
    exitForm.start()
    dataBase.join()
}

fun exitFromProgram(){
    println("Для отмены введи 0")
    val num = readln().toInt()
        if (num == 0){
            println("Завершение полной работы")
            exitProcess(0)
        }
}

data class Person (val name: String, var salary: Int){
    override fun toString(): String = "$name ($salary)"
}
