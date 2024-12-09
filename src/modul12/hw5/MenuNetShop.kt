package modul12.hw5

import kotlin.system.exitProcess

class MenuNetShop() {
    val shopList: MutableList<Shop> = mutableListOf()

    suspend fun firstStep(text: String){
        greeting(text)
        chooseShop()
        println("0: Выйти из интернет-магазина")
        println("----------------------------------------------")

        val answer = readln().toInt()
        when{
            answer == 0 -> exitShop()
            answer in 1..shopList.size -> secondStep(answer-1)
        }

    }

    suspend fun secondStep(num: Int){
        if (shopList[num] is TechnologiesShop){
            var shop = shopList[num] as TechnologiesShop
            shop.offerRepairPhone()
        }

        choosePhone(num)
        println("0: Посмотреть статистику магазина")
        println("----------------------------------------------")

        val listPhones = shopList[num].countPhones.keys.toList()
        val answer = readln().toInt()
        when{
            answer == 0 -> shopList[num].showStatistics()
            answer in 1..listPhones.size -> shopList[num].sellProduct(listPhones[answer-1])
        }

    }

    private fun greeting(text: String) = println(text)

    private fun exitShop(): Nothing{
        exitProcess(0)
    }

    fun chooseShop(){
        println("Выбери магазин: ")

        for (i in 0..<shopList.size){
            println("${i+1}: ${shopList[i]}")
        }
    }

   fun choosePhone(num: Int){
       println("Выбери телефон для покупки: ")
       val listPhones = shopList[num].countPhones.keys.toList()
       for (i in listPhones.indices){
           println("${i+1}: ${listPhones[i]}")
       }
   }
}
