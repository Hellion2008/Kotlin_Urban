package modul4.hw5

fun main() {
    println("Задание №1")
    val box = Box(5.0, 1.0, 2.0)
    println("Объем коробки: ${box.findV()}")
    println("---------------------------------------------")

    println("Задание №2")
    val array = createArray(10)
    showArray(array)
    println()
    println(findMaxAndMin(array).contentToString())
    println("---------------------------------------------")

    println("Задание №3")
    val arrayInt = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    showArray(arrayInt)
    println("---------------------------------------------")

    println("Задание №4")
    val a = 34
    println("a = $a ${whichNumber(a)}")
    println("---------------------------------------------")

    println("Задание №5")
    var car = Car(1500.0, 120.0)
    car.move()
    car.stop()
}

fun whichNumber(a: Int): String {
    var result = when{
        a > 0 && a % 2 == 0 -> "положительное четное число"
        a < 0 && a % 2 == 0 -> "отрицательное четное число"
        a > 0 && a % 2 != 0 -> "положительное нечетное число"
        a < 0 && a % 2 != 0 -> "отрицательное нечетное число"
        else -> "нулевое число"
    }
    return result
}

fun createArray (n: Int): IntArray{
    var array = IntArray(n)
    for (i in array.indices){
        array[i] = (Math.random() * 100).toInt()
    }
    return array
}

fun showArray (array: IntArray){
    for (i in array)
        print("$i ")
}

fun findMaxAndMin(array: IntArray): IntArray {
    var max = array[0]
    var min = array[0]
    var newArray = IntArray(2)
    for (el in array){
        when{
            el > max -> max = el
            el < min -> min = el
        }
    }
    newArray[0] = min
    newArray[1] = max
    return newArray
}