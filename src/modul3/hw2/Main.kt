package modul3.hw2
const val PI = 3.14

fun main() {
    var aSq: Int = 5;
    val pSq: Int = aSq * 4;
    val sSq: Int = aSq * aSq

    var aR: Int = 4
    var bR: Int = 5
    val pR: Int = 2 * (aR + bR)
    val sR: Int = aR * bR

    var d = 5
    val sCircle = PI * d

    var l: Int = 155
    val metr: Int = l / 100

    var a: Int = 230
    var b: Int = 70
    val count: Int = a / b

    println("Периметр квадрата = " + pSq + " | " +
            "Площадь квадрата = " + sSq + " | " +
            "Периметр прямоугольника = " + pR + " | " +
            "Площадь прямоугольника = " + sR + " | " +
            "Длина окружности = " + sCircle + " | " +
            "Сантиметры в метры = " + metr + " | " +
            "Количество целых отрезков = " + count)

}