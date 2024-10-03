package modul4.hw10

open class Bird(val type: String, open val feature: String = "особенная особеннсть птицы") {

    open fun fly(){
        println("Птица летит")
    }
}