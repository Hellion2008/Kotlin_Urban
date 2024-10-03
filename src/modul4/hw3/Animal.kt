package modul4.hw3

class Animal {
    var name = ""
    var weight = 0.0
    var type = ""

    override fun toString(): String {
        return "Домашнее животное: $type\n" +
                "Кличка: $name\n" +
                "Вес: $weight"
    }
}