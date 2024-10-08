package modul9.hw5

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val time1 = measureTimeMillis {
        coroutineScope {
            val channel = getList(splitString(Storage().text))
            var stringResult = ""
            for (line in channel)
                stringResult += (line + "\n")
            println(stringResult)
        }
    }

    println("Задача 1: Затраченное время $time1 мс")
    println("----------------------------------------------")

    val time2 = measureTimeMillis{
        coroutineScope {
            val channelOne = getList(splitString(Storage().text))
            val channelTwo = modifiedList(channelOne)
            var stringResult = ""
            for (line in channelTwo)
                stringResult += (line + "\n")
            println(stringResult)
            println(stringResult.split(Regex("[,.?!\\s:;—]+"))
                .filter { it.isNotEmpty() }
                .map { it.first() })
        }
    }
    println("Задача 2: Затраченное время $time2 мс")

}

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun CoroutineScope.getList(text: List<String>): ReceiveChannel<String> = produce {
    for (line in text){
        delay(10L)
        send(line)
    }
    channel.close()
}

suspend fun CoroutineScope.modifiedList (channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        val index = it.indexOf(' ')
        val part = it.substring(0, index+1).uppercase()
        val str = it.replaceRange(
            0..index, part
        )
        send(str)
    }
}

fun splitString(str: String): List<String>{
    return str.split("\n").toList()
}