package modul4.hw2

fun main() {
    val numbers = intArrayOf(54,2,78,-5,98,9,5,-4,8,2,0,1,-1,6)
    println("Число локальных минимумов: ${localMin(*numbers)}")
    println(checkArray(numbers).contentToString())

    val matrix = arrayOf(
        intArrayOf(5, 4, 78),
        intArrayOf(45,23,48),
        intArrayOf(79,45,5),
        intArrayOf(754,4455,50),
        intArrayOf(759,481,58),
    )
    showRow(matrix, 4)
}

fun localMin(vararg numbers: Int): Int{
    var counter = 0
    for (i in 1..<numbers.size - 1){
        if (numbers[i-1] > numbers[i] && numbers[i] < numbers[i+1])
            counter++
    }
    return counter
}

fun checkArray(numbers: IntArray): IntArray{
    for (i in numbers.indices){
        if (numbers[i] < 0) numbers[i]++

    }
    return numbers
}

fun showRow(matrix: Array<IntArray>, k: Int){
    if (k >= 0 && k <= matrix.size - 1){
        for (i in 0..matrix.size){
            if (k == i)
                println(matrix[i].contentToString())
        }
    } else println("Неверное значение строки матрицы")

}