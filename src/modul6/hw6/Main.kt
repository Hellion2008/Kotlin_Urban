package modul6.hw6

fun main() {
    println("Задание №1")
    println(showYourFavouriteBook("Два капитана"))
    println(showYourFavouriteBook(null))
    println("---------------------------------------------")

    println("Задание №2")
    println(divideIfWhole(120, 2))
    println(divideIfWhole(120, 51))
    println("---------------------------------------------")

    println("Задание №3")
    val array = arrayOf("Привет","как", null, "дела")
    println(arrayWithoutNulls<String>(array).contentToString())

}

fun showYourFavouriteBook(book: String?): String{
    val res = book ?: "У меня нет любимой книги"
    return res
}

fun divideIfWhole(a: Int, b: Int) : Int?{
    var counter: Int? = 0
    var temp = a
    while (temp % b == 0){
        counter = counter?.inc() ?: null
        temp /= b
    }
    counter = counter ?: 0
    return counter
}

inline fun <reified T> arrayWithoutNulls(arr: Array<T?>): Array<T?> =
    arr.filter{ el -> el != null}.toTypedArray()