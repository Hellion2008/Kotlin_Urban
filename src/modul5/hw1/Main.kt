package modul5.hw1

fun main() {
    println("Задание №1")
    val human = Human("Peter")
    human.Head().think()
    human.Legs().run()
    human.Legs().go()
    println("----------------------------------------")

    println("Задание №2")
    val array = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    findSubstr(array, "про")
    println("----------------------------------------")

    println("Задание №3")
    val arrayInt = arrayOf(4,5,0,8,7,6,3,1,0,6,8,1,2)
    println(countBetweenZeros(arrayInt))

}

fun findSubstr(array: Array<String>, sub: String){
    for (str in array){
        if(str.contains(sub, true))
            println(str)
    }
}

fun countBetweenZeros(array: Array<Int>): Int{
    var firstZero = false
    var counter = 0
    for(i in array){
        when {
            firstZero && i == 0 -> break
            firstZero -> counter++
            i == 0 -> firstZero = true
        }
    }
    return counter
}