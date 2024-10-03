package modul5.hw1

class Human (val name: String){

    inner class Head(){
        fun think(){
            println("Мозг человека по имени $name думает и размышляет")
        }
    }

    inner class Legs(){
        fun go(){
            println("$name идет")
        }

        fun run(){
            println("$name бежит")
        }
    }
}