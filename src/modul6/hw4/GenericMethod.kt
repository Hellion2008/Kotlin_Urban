package modul6.hw4

class GenericMethod<T> {
    fun <T> isItIncluded(value : T, arr: Array<T>) : Boolean{
        for (e in arr)
            if (e == value)
                return true
        return false
    }
}