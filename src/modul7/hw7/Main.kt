package modul7.hw7

fun main() {
    val map = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three",
        10 to "Number", 20 to "Apple", 30 to "aaaaaa", 777 to "Гусь")
    println(map.filter { (k,v)-> k < 5 })
    println(map.filter { (k,v)-> v.endsWith("a") })
    println(map.filter { (k,v)-> v.startsWith("Г") })
    println("-------------------------------------------------")

    val prizemap = HashMap<Int, Int>()
    val employees = listOf(
        Employee(1,"Peter"),
        Employee(5, "Bruce"),
        Employee(13, "John"),
        Employee(45, "Natasha"),
        Employee(65, "Tony")
    )
    for (e in employees){
        prizemap.put(e.id, (Math.random()*30).toInt())
    }
    println(prizemap)

    println(prizemap.filter { (k,v)-> (k % 5) == 0 && v >= 20})
}

data class Employee(val id: Int, val name: String){}