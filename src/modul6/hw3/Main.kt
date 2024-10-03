package modul6.hw3

fun main() {
    println("Задание №1")
    myPrint(true)
    myPrint(123)
    myPrint(123.0)
    myPrint("Text")
    println("--------------------------------------------------")

    println("Задание №2")
    val person1 = Person("Bruce", 4561556)
    val person2 = Person("Peter", "+7 897 456 52 65")
    println(person1)
    println(person2)
    println("--------------------------------------------------")

    println("Задание №3")
    println(showSymbols(10,'{'))
    println(showSymbols(10.1,'('))
    println(showSymbols("Десять",'*'))
    println(showSymbols(true,'|'))
}

fun <T> myPrint(value: T){
    println(value)
}

fun <T> showSymbols(value: T, ch: Char): String {
    val brackets = arrayOf('<','[','{')
    return when{
        ch == '(' || ch == ')' -> "($value)"
        brackets.contains(ch) -> "$ch$value${ch+2}"
        else -> "$ch$value$ch"
    }
}

