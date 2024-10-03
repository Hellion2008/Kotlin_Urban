package modul4.hw7

class Dog(name: String, weight: Double) : Animal(name, weight) {
    fun serve(){
        println("$name, голос! Сидеть! Лежать!")
    }
}