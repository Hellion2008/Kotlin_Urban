package modul12.hw1

data class Person(val name: String, var role: String) {
    override fun toString(): String {
        return "Пользователь $name, $role"
    }
}