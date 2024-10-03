package modul4.hw7

open class IPhone {
    var width: Double = 0.0
    var height: Double = 0.0
    var depth: Double = 0.0

    lateinit var color: String
    lateinit var camera: String

    fun call(){
        println("Звонит мой Айфончик")
    }
}
