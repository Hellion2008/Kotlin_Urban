package modul6.hw5

class CatalogUsers {
    var list = Array<User?>(10){null}

    fun greeting(){
        println("Вас приветствует новый каталог!")
    }

    fun createList(){
        try {
            println("Введите фамилию:")
            val surname = readLine()
            println("Введите имя")
            val name = readLine()
            if (name.equals("") || surname.equals(""))
                throw NameEmptyException("Имя и фамилия не введены!")
            val user = User(name.toString(), surname.toString())

            println("Введите позицию для добавления в каталог")
            val pos = readln().toInt()
            if (pos < 0 || pos > list.size-1)
                throw CapacityException("Нет такой позиции в каталоге!")
            list?.set(pos, user)
        } catch (e: NameEmptyException) {
            println(e.message)
        } catch (e: CapacityException) {
            println(e.message)
        }

    }
}