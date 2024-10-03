package modul6.hw4

fun main() {

    println("Задание №1")
    println(States<Int>().getAverage(arrayOf(1,2,1,2,3,4)))
    println(States<Double>().getAverage(arrayOf(1.1,2.6,12.3,33.2,4.2)))
    println("-----------------------------------------")

    println("Задание №2")
    val arrStr = arrayOf("dffds", "sdqdqw", "number", "edwe ")
    val arrInt = arrayOf(5,6,3,5,8,1,3)
    println(GenericMethod<String>().isItIncluded("number",arrStr))
    println(GenericMethod<Int>().isItIncluded(8,arrInt))

}