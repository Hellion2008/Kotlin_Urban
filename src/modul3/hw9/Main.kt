package modul3.hw9

fun main() {
    //task1
    val matrix1 = arrayOf(
        intArrayOf(5, 4, 78),
        intArrayOf(45,23,48),
        intArrayOf(79,45,5)
    )
    var min = matrix1[0][0]
    for (row in matrix1)
        for (el in row){
            if (el < min)
                min = el
        }
    println("Минимальное значение в матрице: $min")
    println("-------------------------------------------")
    //task2
    val matrix2 = arrayOf(
        intArrayOf(5, 4, 78, 87, 2),
        intArrayOf(45,23,48, 63, 4),
        intArrayOf(79,45,5, 41, 40)
    )
    var sum = 0.0
    var count = 0
    for (i in matrix2.indices){
        for (j in matrix2[i].indices){
            sum += matrix2[i][j].toDouble()
            count++
        }
    }
    println("Медиана матрицы: ${sum/count}")
    println("-------------------------------------------")
    //task3
    var matrix3 = Array(5){IntArray(5)}
    for (i in 0..<matrix3.size) {
        for (j in 0..<matrix3[i].size) {
            if (j <= i && (i + j) >= matrix3.size/2 * 2 && i >= matrix3.size/2)
                matrix3[i][j] = 1
            print("${matrix3[i][j]}\t")
        }
        println()
    }
    println("-------------------------------------------")
    //task4
    var max = Int.MIN_VALUE + 1
    var secondMax = Int.MIN_VALUE
    for (row in matrix1){
        for (el in row){
            if (el > max){
                secondMax = max
                max = el
            }
        }
    }
    println("Второе максимальное число (после $max): $secondMax")
}