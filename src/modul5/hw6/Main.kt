package modul5.hw6

fun main() {
    println("Задание №1")
    val n = 5
    var operation: (Int) -> Int = ::fact
    println("Факториал числа $n: ${operation(n)}")
    println("--------------------------------------------------")

    println("Задание №2")
    operation = ::powerTenRec
    println(operation(6))
    println("--------------------------------------------------")

    println("Задание №3")
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(changeElements(array).contentToString())
}

fun fact(num: Int): Int{
    if (num == 1)
        return 1
    val result = fact(num-1) * num
    return result
}

fun powerTenRec(num: Int): Int{
    if (num == 0)
        return 1
    val result = 10 * powerTenRec(num - 1)
    return result
}

fun changeElements(array: Array<Int>): Array<Int>{
    val result = array.copyOf()
    for (i in result.indices step 2){
        result[i]++
    }
    return result
}