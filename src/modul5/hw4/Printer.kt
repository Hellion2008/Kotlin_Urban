package modul5.hw4

abstract class Printer {
    var name = ""

    constructor()

    constructor(name: String) {
        this.name = name
    }


    abstract fun print()
}