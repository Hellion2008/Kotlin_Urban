package modul4.hw9

abstract class EmergencyServices (val name: String, val phone: Int): Printable{
    abstract fun doItFast(): String
}