package modul6.hw3

class Person<T> (val name: String, val phone: T) {
    override fun toString(): String {
        return "Person: name='$name', phone=$phone"
    }
}