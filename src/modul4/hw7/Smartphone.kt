package modul4.hw7

open class Smartphone {
    var width: Double = 0.0
    var height: Double = 0.0
    var depth: Double = 0.0

    lateinit var CPU: String
    lateinit var memory: String

    fun call(){
        println("Звонит аппарат на Android")
    }
}
