package modul4.hw10

class Ostrich(type: String, override val feature: String = "бег") : Bird(type) {
    override fun fly(){
        println("$type не летит, зато бежит!")
    }
}