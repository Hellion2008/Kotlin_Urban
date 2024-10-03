package modul4.hw8

fun main() {
    println("Задание №1")
    val magnit = Magnit("Магнит",
        arrayOf("молоко", "сметана", "сыр", "кефир", "ряженка"),
        5
    )
    magnit.work()
    magnit.upgradeShop()
    magnit.createSale(15)

    val pyaterochka = Pyaterochka("Пятерочка",
        arrayOf("мороженое", "киндер-сюрприз", "шоколад", "мармелад"),
        10
    )
    pyaterochka.upgradeShop()
    pyaterochka.createSale(5)
    println("-------------------------------------------")

    println("Задание №2")
    val student = Student("Peter", "Parker", 17)
    student.work()
    println(student.showInfo())
    println(student.createDocument())
    student.eatDinner()

    val employee = Employee("Bruce", "Wayne", 33)
    employee.work()
    println(employee.createDocument())
    println("-------------------------------------------")

    println("Задание №3")
    println("1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр")
    println(convertLength(5, 4.23))
}

fun convertLength(number: Int, metr: Double) : Double{
    var result = 0.0
    when(number){
        1 -> result = metr * 10
        2 -> result = metr / 1000
        3 -> result = metr
        4 -> result = metr * 1000
        5 -> result = metr * 100
    }
    return result
}