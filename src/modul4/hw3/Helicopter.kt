package modul4.hw3

class Helicopter {
    var name = ""
    var speed = 0.0
    var maxHeight = 0.0
    var beginWeight = 0.0

    override fun toString(): String {
        return "Вертолет $name " +
                "со скоростью полета $speed, " +
                "с высотой полета $maxHeight, " +
                "с взлетным весом $beginWeight"
    }
}