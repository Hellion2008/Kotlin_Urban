package modul9.hw3

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    val nums = getRandomList(10)
    val chars = getRandomList().take(10)

    val time = measureTimeMillis {
        val first = async{ unpack(nums) }
        val second = async{ unpack(chars) }

        println("Общий размер списков: ${first.await() + second.await()}")

        val mutList = concatenate(chars, nums)
        println(mutList.second)
    }
    println("Потраченное время - $time")
}

fun getRandomList(n: Int): List<Int>{
    return (1..100).shuffled().take(n)
}


fun getRandomList(): List<Char>{
    return ('a'..'z').shuffled()
}

suspend fun <T> unpack(list: List<T>): Int{
    var counter = 0
    list.forEach {
        delay(100L)
        println(it)
        counter++
    }
    return counter
}

fun <T,E> concatenate(list1: List<T>, list2: List<E>): Pair<Int, MutableList<Any?>>{
    val tempList = list1.plus(list2).toMutableList()
    val size = list1.size + list2.size
    return Pair(size, tempList)
}