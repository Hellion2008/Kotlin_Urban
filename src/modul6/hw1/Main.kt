package modul6.hw1

fun main() {
    println("Задание №1")
    val printCount = {n: Int ->
        for (i in 0..n)
            print("$i ")
        println()
    }
    printCount(3)
    println("--------------------------------------")

    println("Задание №2")
    val average = {arr: Array<Int> ->
        arr.sum().toDouble() / arr.size
    }
    println(average(arrayOf(1,2,3)))
    println("--------------------------------------")

    println("Задание №3")
    val array = arrayOf(-1,2,3,-4,5,-6,-7,8,-9)
    println(array.filter { x -> x > 0 })
    println("--------------------------------------")

    println("Задание №4")
    val changeArray = { array: Array<Int> ->
        for(i in array.indices){
            when{
                array[i] % 2 == 0 -> array[i] /= 2
                else -> array[i] *= 3
            }
        }
        array
    }
    println(changeArray(arrayOf(1,2,3,4,5,6,7,8,9)).contentToString())

}