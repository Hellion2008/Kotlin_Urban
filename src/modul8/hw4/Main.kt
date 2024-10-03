package modul8.hw4

fun main() {
    println("Task №1")

    data class Employee(val name:String, var age: Int, var salary: Double){
        override fun toString(): String {
            return "$name ($age) - $salary"
        }
    }

    val employees = listOf(
        Employee("Bruce", 35, 150000.0),
        Employee("Peter", 28, 110000.0),
        Employee("Tom", 41, 250000.0),
        Employee("Tony", 35, 1150000.0),
        Employee("Serg", 34, 2150000.0))

    println(employees.sortedBy {it.name})
    println(employees.sortedBy {it.age})
    println(employees.sortedBy {it.salary})
    println("-------------------------------------------------------")

    println("Task №2")
    val matrix2 = arrayOf(
        arrayOf(5,7,1,2),
        arrayOf(8,4,0,1),
        arrayOf(12,6,9,8))
    matrix2.forEach { println(it.sortedArray().contentToString()) }
    println("-------------------------------------------------------")

    println("Task №3")
    val matrix3 = arrayOf(
        arrayOf(5,7,1,2),
        arrayOf(8,4,0,1),
        arrayOf(12,6,9,8))
    println("Count of sawtooth arrays - ${countSawtoothArrays(matrix3)}")
    matrix3.filter { isSawtooth(it) }.forEach { println(it.contentToString()) }

}

fun countSawtoothArrays(matrix: Array<Array<Int>>): Int{
    var counter = 0
    for(row in matrix){
        if (isSawtooth(row))
            counter++
    }
    return counter
}

fun isSawtooth(arr: Array<Int>): Boolean{
    for (i in 1..arr.size-2){
        if ((arr[i] > arr[i-1] && arr[i] < arr[i+1]) ||
            (arr[i] < arr[i-1] && arr[i] > arr[i+1]))
            return false
    }
    return true
}