package modul4.hw7

fun main() {
    println("Задание №1")
    val animal = Animal("Жираф", 2000.0)
    val cat = Cat("Барсик", 4.5)
    val dog = Dog ("Шарик", 15.6)
    cat.purr()
    dog.serve()
    cat.eat()
    animal.eat()
    println("-------------------------------------------")

    println("Задание №2")
    val nokia = Nokia()
    nokia.call()
    val sony = Sony()
    sony.call()
    println("-------------------------------------------")

    println("Задание №3")
    val array = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    specialArray(array, 5)
}

fun specialArray (array: IntArray, k: Int){
    for (i in array)
        if (i % k == 0)
            print("$i ")
    println()
}