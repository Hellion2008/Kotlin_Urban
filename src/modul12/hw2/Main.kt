package modul12.hw2

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlin.system.measureTimeMillis

suspend fun main() {
    println("Введите количество пользователей: ")
    val countUsers: Int = readln().toInt()
    println("Введите с какого символа нужны пароли: ")
    val symbol = readln()

    val listId: MutableList<String> = mutableListOf()
    val listPassword: MutableList<String> = mutableListOf()
    val resultMap: MutableMap<String, String> = mutableMapOf()

    val time = measureTimeMillis {
        withContext(newSingleThreadContext("creationPasswords")){
            launch { getIdFlow(countUsers).collect{id -> listId.add(id)}}
            launch { getPasswordFlow(symbol,countUsers).collect{password -> listPassword.add(password)} }
        }

        resultMap.putAll(listId.zip(listPassword).toMap())
    }
    println(resultMap)
    println(time)
}

suspend fun getIdFlow(length: Int) = flow {
    val list = getListId(length)
    for (id in list){
        emit(id)
    }
}

suspend fun getPasswordFlow(input: String, length: Int) = flow {
    val list = getListPassword(input, length)
    for (id in list){
        emit(id)
    }
}

fun createPassword(): String{
    val length = 6
    val symbols = ('a'..'z').plus(('0'..'9'))
    var password: String = ""
    for (i in 0..<length){
        val symbol = symbols.random()
        if (i % 2 == 0 && symbol.isLetter())
            password += symbol.toString().toUpperCase()
        else
            password += symbol.toString()
    }
    return password
}

fun getListPassword(input: String, length: Int): List<String>{
    var listGeneratedPassword: MutableList<String> = mutableListOf()
    var counter = 0
    while(counter < length){
        val password = createPassword()
        if (password.first().toString() == input){
            listGeneratedPassword.add(password)
            counter++
        }
    }
    return listGeneratedPassword.toList()
}

fun getListId(length: Int): List<String>{
    var listGeneratedPassword: MutableList<String> = mutableListOf()
    for (i in 1..length){
        listGeneratedPassword.add(i.toString().padStart(6,'0'))
    }
    return listGeneratedPassword.toList()
}
