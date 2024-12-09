package modul12.hw5

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TechnologiesShop(name: String = "Телефончики", city: String, val isRepairShop: Boolean = false)
    : Shop(name, city) {

    override fun toString(): String {
        return if (isRepairShop) super.toString() + " с ремонтной мастерской" else super.toString()
    }

    override fun purchaseMessage(namePhone: String, count: Int) {
        val message = if (count > 0)"Телефон \"$namePhone\" куплен, осталось еще $count телефонов"
            else "Телефонов $namePhone больше не осталось."
        println(message)
    }

    private var isUsedRepair = true
    suspend fun offerRepairPhone(){
        if (isUsedRepair){
            println("Вам нужно починить телефон?")
            println("1. Да \n2. Нет\n")
            val answer = readln().toInt()
            when (answer){
                1 -> {
                    coroutineScope { launch {repairPhone() } }
                    isUsedRepair = false }
                2 -> println("Обращайтесь к нам в любое время!")
            }
        }
    }

    suspend private fun repairPhone(){
        print("Секунду")
        repeat(5){
            print(".")
            delay(500L)
        }
        println("\nВаш телефон починили за считанные секунды!\n")
    }
}