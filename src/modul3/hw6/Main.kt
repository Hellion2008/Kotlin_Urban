package modul3.hw6

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    //Task1
    var a = 10
    var b = 20
    for (i in a..b){
        if (a >= b){
            println("Сркднее арифметическое - $a")
            break
        }
        a++
        b--
    }
    println("----------------------------")
    //Task2
    val sCircle = 0.785
    val d = sqrt(4 * sCircle / Math.PI)
    val l = Math.PI * d
    println("При площади окружности S = $sCircle длина окружности L = $l и ее диаметр D = $d ")
    println("----------------------------")
    //Task3
    val x1 = 5
    val y1 = -2
    val x2 = 8
    val y2 = 9
    println("Координаты ($x1,$y1) и ($x2,$y2)")
    val recX: Int = abs(x2 - x1)
    val recY: Int = abs(y2 - y1)
    println("Площадь прямоугольника - ${recY * recX}, Периметр прямоугольника - ${2 * (recY + recX)}")
    println("----------------------------")
    //Task4
    val maxNumber = 512
    var res = 1
    for (i in 1..Int.MAX_VALUE){
        if (res <= maxNumber)
            print("${res} ")
        else break
        res *= 2
    }
    println()
    println("----------------------------")
    //Task5
    var n = 20
    for (i in 20 downTo 0 step 2)
        print("$i ")
}