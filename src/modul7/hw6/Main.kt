package modul7.hw6

fun main() {
    println("Задание №1")
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    println(superTask(array))
    println("------------------------------------------")

    println("Задание №2")
    val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")
    println(removeByValue(people))
    println("------------------------------------------")

    println("Задание №3")
    val personHashMap = HashMap<Int, Person>()
    val states = arrayOf("Рабочий", "Инженер", "Менеджер", "Руководитель")
    val names = arrayOf("Иван","Данил","Лида","Петр","Анна")
    for (i in 0..5){
        personHashMap.put(i, Person(
            names[(Math.random() * names.size).toInt()],
            (Math.random()*50).toInt(),
            states[(Math.random() * states.size).toInt()])
        )
    }
    println(personHashMap)
}

fun <K> superTask(arr: Array<K>): Map<K, Int>{
    val map = HashMap<K, Int>()
    for (el in arr){
        if (!map.containsKey(el))
            map.put(el,1)
        else{
            map.set(el, map[el]!! + 1)
        }
    }
    return map
}

fun removeByValue(map: MutableMap<Int, String>): MutableMap<Int, String>{
    println("Введи удаляемое значение")
    val v = readln()
    val iterator = map.iterator()
    while (iterator.hasNext()){
        if (iterator.next().value == v)
            iterator.remove()
    }
    return map
}