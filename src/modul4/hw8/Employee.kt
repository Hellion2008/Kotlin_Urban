package modul4.hw8

class Employee(name: String, surname: String, age: Int) : Person(name, surname, age) {
    override fun work() {
        if (age < 18)
            println("Иди домой, малыш")
        else
            println("Работник $surname $name пошел усердно вкалывать")
    }

    override fun createDocument(): String {
        return "Пропуск на имя $name $surname"
    }
}