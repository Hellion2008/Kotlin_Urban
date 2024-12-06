package modul12.hw3

import kotlinx.coroutines.flow.*

suspend fun main() {
    println("Задание №1")
    val resultTaskOne = listOf(2, 4, 8, 5, 2).asFlow().map { n -> n*n }.reduce{a,b -> a+b}
    println(resultTaskOne)
    println("----------------------------------------")

    println("Задание №2")
    personList.asFlow().getPerson("A", 30)

    println("----------------------------------------")

    println("Задание №3")
    val employeesNames = personList.map { it.name }.asFlow()
    val cards: MutableList<String> = mutableListOf()
    val passwords: MutableList<Int> = mutableListOf()
    repeat(personList.size){
        cards.add(createCardNumber())
        passwords.add(createNumber())
    }
    creationEmployeeFlow(employeesNames, cards.asFlow(), passwords.asFlow())
        .collect{person -> println(person)}

    println("----------------------------------------")
}

val personList = listOf(
    Person("Anna", 45),
    Person("Serg", 34),
    Person("Alina", 21),
    Person("Andrew", 10),
    Person("Nick", 56),
    Person("Olga", 31),
    Person("Vladimir", 65),
    Person("Natalie", 23),
    Person("Karina", 28),
    Person("Tom", 15),
)

suspend fun Flow<Person>.getPerson (first: String, age: Int) {
    this.filter { it.name.first().toString() == first && it.age > age}
        .collect{person -> println(person) }
}

data class Person (val name: String, val age: Int){
    override fun toString(): String {
        return "$name($age y.o.)"
    }
}

data class Employee (val name: String, val card: String, val password: Int){
    override fun toString(): String {
        return "Person(name=$name, card=$card, password=$password)"
    }
}

fun createNumber() = (1000..9999).random()

fun createCardNumber(): String{
    var number = createNumber().toString()
    repeat(3){
        number += " ${createNumber()}"
    }
    return number
}

suspend fun creationEmployeeFlow(
    names: Flow<String>, cards: Flow<String>, passwords: Flow<Int>
): Flow<Employee>{
    val tempFlow = names.zip(cards){name, card -> "$name-$card"}
    return tempFlow.zip(passwords)
        {temp, pass -> Employee(temp.split("-")[0], temp.split("-")[1], pass)}
}