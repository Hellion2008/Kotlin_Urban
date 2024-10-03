package modul9.hw1

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope{
    val persons = listOf(
        Person("Bruce", 35),
        Person("Peter", 28),
        Person("Kaneki", 18),
        Person("Tony", 41),
        Person("Leo", 25)
    )

    val cities = listOf(
        Weather("Moscow", "BigCity", 23.1),
        Weather("St. Petersburg", "CulturalCity", 20.8),
        Weather("Stravropol", "HotCity", 30.6),
        Weather("London", "AnotherCity", 18.1)
    )

    val randomNumbers = (1..100).shuffled().take(10)

    var personList = emptyList<Person>()
    var weatherList = emptyList<Weather>()
    var randoms = emptyList<Int>()
    val tasks = listOf(
        launch { personList = loadFromServer<Person>(persons) },
        launch { weatherList = loadFromServer<Weather>(cities) },
        launch { randoms = loadFromServer<Int>(randomNumbers) }
    )
    tasks.joinAll()

    println("Данные загружены")

    println(personList)
    println(weatherList)
    println(randoms)
    println("Программа завершена")
}

suspend fun<T> loadFromServer(list: List<T>): List<T>{
    for (el in list){
        println(el)
        delay(100L)
    }
    return list
}

data class Person (val name: String, var age: Int){
    override fun toString(): String = "$name($age)"
}

data class Weather(val city: String,
                   var description: String,
                   var temp: Double){
    override fun toString(): String = "$city ($description): $temp"
}