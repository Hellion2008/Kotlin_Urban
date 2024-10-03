package modul9.hw2

import kotlinx.coroutines.*

suspend fun main() = runBlocking<Unit> {
    println("Task 1")
    task1()

    println("Task 2")

    launch {
        println("Начало программы")
        for (i in 1..2){
            delay(1000L)
            println(i)
        }
    }
    val lazyCor = launch(start = CoroutineStart.LAZY) {
        delay(3000L)
        println("Произошел ленивый запуск")
        for (i in 3..4){
            delay(1000L)
            println(i)
        }
    }
    lazyCor.start()

    launch {
        delay(6000L)
        println("Программа завершена")
    }
}

private suspend fun CoroutineScope.task1() {
    println("Программа покупки продуктов")
    delay(1000L)
    println("Купить товар:\n1.Да\n2.Нет")
    val choise = readln().toInt()
    when (choise) {
        1 -> buying()
        2 -> annulment()
        else -> println("Неверные данные")
    }
    val goodBye = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("До свидания")
    }
    goodBye.start()
    goodBye.join()
    println("----------------------------------")
}

suspend fun buying() = coroutineScope {
    println("Оплата продукта началась")
    delay(2000L)
    println( "Сканирование и обработка..." )
    delay(2000L)
    println("Покупка оплачена")
}

suspend fun annulment() = coroutineScope {
    println("Отмена покупки...")
    delay(2000L)
    println("Покупка отменена.")
}

//suspend fun goodBye(): Job = coroutineScope{
//    return@coroutineScope launch(start = CoroutineStart.LAZY) { println("До свидания") }
//}