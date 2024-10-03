package modul7.hw1

fun main() {
    println("Задание №1")
    var a = 5
    println(a.powNum(3))
    println("-------------------------------------------")

    println("Задание №2")
    val s = "новая"
    println(s.plusStr(" строка"))
    println("-------------------------------------------")

    println("Задание №3")
    println("Последний индекс: ${s.getLastIndex()}")
    println("-------------------------------------------")

    println("Задание №4")
    val b = 9
    println(b.sqNum())

}

fun Int.powNum(pow : Int) : Int{
    var res = 1
    for (i in 0..<pow){
        res *= this
    }
    return res
}

fun String.plusStr(str: String) : String{
    return this + str
}

fun String.getLastIndex(): Int{
    return this.length-1
}

fun Int.sqNum(): Double{
    return Math.pow(this.toDouble(), 0.5)
}



