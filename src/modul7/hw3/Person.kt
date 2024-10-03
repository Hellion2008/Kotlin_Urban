package modul7.hw3

class Person(val name: String) {
    infix fun say(message: String){
        println("$name говорит: $message")
    }
}