package modul4.hw10

class Eagle(type: String, override val feature: String = "зоркий глаз"): Bird(type) {
    override fun fly() {
        println("$type летит быстрее ветра!")
    }
}