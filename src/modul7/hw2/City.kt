package modul7.hw2

class City(var name: String, var population: Long?) {

    constructor(name: String) : this(name, null){}

    override fun toString(): String {
        return "Город $name с населением $population человек"
    }
}