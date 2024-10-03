package modul7.hw5

fun main() {
    println("Задание №1")
    val beginSet = mutableSetOf(1,6,8,5,6,5,62,0)
    val eventSet = beginSet.stream().filter { it % 2 == 0 }.toList().toSet()
    println(eventSet)
    val nonEventSet = beginSet.stream().filter { it % 2 != 0 }.toList().toSet()
    println(nonEventSet)
    println("------------------------------------------")

    println("Задание №2")
    val someSet = HashSet<Int>()
    for (el in beginSet)
        if ((el * 2) % 5 == 0)
            someSet.add(el * 2)
    println(someSet)
    println("------------------------------------------")

    println("Задание №3")
    val set1 = removeDuplicates(arrayListOf(4,6,6,4,8,2,44,4))
    val set2 = removeDuplicates(arrayListOf("45", "defewfwe", "повтор"," ewefew ", "45", "повтор"))
    println(set1)
    println(set2)
    println("------------------------------------------")

    println("Задание №4")
    var arr = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    println(putZerosToEnd(arr).contentToString())
}

fun <T> removeDuplicates (collection: Collection<T>?):Set<T>?{
    return collection?.toSet()
}

fun putZerosToEnd(arr: Array<Int>): Array<Int>{
    for (i in 1..<arr.size)
        for (j in 0..<arr.size -i){
            if (arr[j] == 0){
                arr[j] += arr[j+1]
                arr[j+1] = arr[j] - arr[j+1]
                arr[j] -= arr[j+1]
            }
        }
    return arr
}