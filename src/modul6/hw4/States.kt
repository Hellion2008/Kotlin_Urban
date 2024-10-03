package modul6.hw4

class  States<T: Number> {

    fun getAverage(arr: Array<T>) : Double{
        var sum : Double = 0.0
        for (e in arr)
            sum += e.toDouble()
        return sum / arr.size
    }
}