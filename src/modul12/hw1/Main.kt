package modul12.hw1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach

suspend fun main() {
    val personsList: MutableList<Person> = mutableListOf()
    val phones: MutableList<String> = mutableListOf()

        withContext(newSingleThreadContext("persons_and_phones")){
            launch{
                getPhoneFlow(persons.size).collect { number -> phones.add(number)}
            }
            launch { getPersonsFlow().collect{ person -> personsList.add(person)} }
        }
        val personInfo = personsList.zip(phones) {
            person, phone -> "$person, $phone"

        }
        personInfo.forEach { println(it) }
}

val persons = listOf(
    Person("Bruce Wayne", "Boss"),
    Person("Peter Parker", "Photographer"),
    Person("Bruce Banner", "Scientist"),
    Person("Oswald Cobblepot", "Businessman")
)

suspend fun getPersonsFlow() = persons.asFlow().onEach { delay(100L) }

suspend fun getPhoneFlow(length: Int)= flow{
    val startLine = "+7917"
    for (i in 0..<length){
        val endLine = (1000000..9999999).random()
        emit(startLine + endLine)
    }
}