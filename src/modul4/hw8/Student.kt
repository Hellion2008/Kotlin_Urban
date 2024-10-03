package modul4.hw8

class Student(name: String, surname: String, age: Int) : Person(name, surname, age) {
    override fun work() {
        println("$name $surname пошел усердно учиться в институт")
    }

    override fun createDocument(): String {
        return "Стунческий билет на имя студента: $surname $name."
    }
}