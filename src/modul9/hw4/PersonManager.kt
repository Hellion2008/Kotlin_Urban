package modul9.hw4

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class PersonManager(){
    private var personList: MutableList<Person> = emptyList<Person>().toMutableList()
    private var personMap: MutableMap<Person, Int> = emptyMap<Person,Int>().toMutableMap()

    fun setPersonList(list: MutableList<Person>){
        personList = list
    }

    fun addPerson(person: Person){
        personList.addLast(person)
    }

    suspend fun addPassword(){
        for (person in personList){
            personMap[person] = 100000 + (Math.random() * 899999).toInt()
            delay(500L)
            println("done")
        }
    }

    suspend fun readDataPersonList(){
        personMap.forEach{
            println("Сотрудник: ${it.key}; пароль: ${it.value}")
            delay(1000L)
        }
    }
}