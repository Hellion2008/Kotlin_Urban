package modul4.hw7

class Cat(name: String, weight: Double) : Animal(name, weight) {
    fun purr(){
        println("\"Мур-мяу!\" - промурлыкал $name")
    }
}