package modul4.hw8

abstract class Person(val name: String, val surname: String, var age: Int) {

    abstract fun work()
    abstract fun createDocument(): String

    open fun showInfo(): String{
        return "$surname $name, $age лет"
    }

    open fun eatDinner(){
        println("Наконец-то время обеда")
    }


}