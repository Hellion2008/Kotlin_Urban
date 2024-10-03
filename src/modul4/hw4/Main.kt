package modul4.hw4

fun main() {
    val oneMan = Registration()
    oneMan.setEmail("hello@world.com")
    oneMan.setPassword("7894")
    println(oneMan.getEmail())
    println("----------------------------------------")
    val matrix = arrayOf(
        intArrayOf(5, 4, 78, 6),
        intArrayOf(45,23,48, 41),
        intArrayOf(79,45,5, 12),
        intArrayOf(754,4455,50, 0)
    )
    findEvenNumbers(matrix)
    println("----------------------------------------")

    showMatrix(createMatrix(4,4))
    println("----------------------------------------")
    val  array = arrayOf(45,-65,-5,4,-12,0,3,-5,2,4,-56)
    showPositiveNumbers(array)
}

fun findEvenNumbers(matrix: Array<IntArray>){
    for (i in matrix.indices){
        for (j in matrix[i].indices){
            if (matrix[i][j] % 2 == 0)
                print("${matrix[i][j]} ")
        }
    }
    println()
}

fun createMatrix(m: Int, n: Int): Array<IntArray>{
    val matrix = Array(m){IntArray(n)}
    var counter = 0
    for (i in matrix.indices){
        for (j in matrix[i].indices){
            matrix[i][j] = ++counter
        }
    }
    return matrix
}

fun showMatrix (matrix: Array<IntArray>){
    for (i in 0 ..< matrix.size){
        println(matrix[i].joinToString(", "))
    }
}

fun showPositiveNumbers(array: Array<Int>){
    fun checkNum (x: Int): Boolean{
        return x > 0
    }

    for (i in array){
        if (checkNum(i))
            print("$i ")
    }
}
