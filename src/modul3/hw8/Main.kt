package modul3.hw8

fun main() {
    //Task1
    val array = arrayOf<Double>(1.5, 2.5, 6.5, 4.9, 7.8, 9.7, 15.4, 7.5, 4.1, 5.3)
    var result: Double = 1.0
    for (i in array)
        result *= i
    println("Произведеение чисел в массиве - $result")
    println("------------------------------------")
    //Task2
    val arr = arrayOf<Int>(4,5,6,78,9,3,45,65)
    println("Среднее арифметическое массива - ${arr.average()}")
    println("------------------------------------")
    //Task3
    val  size = 10
    val arr3 = IntArray(size)
    for (i in arr3.indices){
        arr3[i] = (Math.random() * 100).toInt()
    }
    println(arr3.contentToString())
    var counter = 0
    print("Четные числа в массиве: ")
    for (i in arr3){
        if (i % 2 == 0){
            print("$i ")
            counter++
        }
    }
    print("(общее количество - $counter)\n")
//    for (i in arr3)
    println("------------------------------------")
    //Task4
    val n = 5
    val arr4 = IntArray(n)
    for (i in 0..<n){
        arr4[i] = Math.pow(2.0,(i+1).toDouble()).toInt()
    }
    println(arr4.contentToString())

    val nT = 5
    val arr4T = IntArray(nT)
    var temp = 1
    for (i in 0..<nT){
        temp *= 2
        arr4T[i] = temp
    }
    println(arr4.contentToString())
}