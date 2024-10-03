package modul4.hw5

class Car() {
    var weight = 0.0
    var speed = 0.0

    constructor(weight: Double, speed: Double): this() {
        this.speed = speed
        this.weight = weight
    }

    fun move(){
        println("Поехали!!!")
    }

    fun stop(){
        print("Тормозим!!!")
    }
}