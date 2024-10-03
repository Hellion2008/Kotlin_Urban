package modul7.hw3

fun main() {
    println("Задание №1")
    println(5 plus 5)
    println(5 minus 5)
    println(5 multiply 5)
    println(5 divide 0.0)

    println("-----------------------------------")

    println("Задание №2")
    val person = Person("Bruce")
    person say "Hello, my friend"
    println("-----------------------------------")

    println("Задание №3")
    val pointOne = Point()
    val pointTwo = Point(4.5, -5.4)
    println(pointOne isAbove pointTwo)
    println(pointOne isRightOf pointTwo)
}

infix fun Int.plus(a: Int): Int{
    return this + a
}

infix fun Int.minus(a: Int): Int{
    return this - a
}

infix fun Int.multiply(a: Int): Int{
    return this * a
}

infix fun Int.divide(a: Double): Double{
    return this / a
}