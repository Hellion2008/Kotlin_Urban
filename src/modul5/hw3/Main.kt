package modul5.hw3

fun main() {
    println("Задание №1")
    var answer = 1
    do{
        println("Ведите месяц года: ")
        val month = readln()
        println(showSeason(month)?.title)

        println("1.Продолжить")
        println("2.Закончить программу")
        answer = readln().toInt()
    } while(answer != 2)
    println("-------------------------------------------------")
    println("Задание №2")
    println(countRepeatLetters("Шумоизоляция"))

}

fun showSeason(month: String): Seasons? {
    when(month){
        Months.JANUARY.title, Months.FEBRUARY.title, Months.DECEMBER.title -> return Seasons.WINTER
        Months.MARCH.title, Months.APRIL.title, Months.MAY.title -> return Seasons.SPRING
        Months.JUNE.title, Months.JULY.title, Months.AUGUST.title -> return Seasons.SUMMER
        Months.SEPTEMBER.title, Months.OCTOBER.title, Months.NOVEMBER.title -> return Seasons.AUTUMN
    }
    return null
}

fun countRepeatLetters(str: String): Int{
    var counter = 0
    var tempArray = CharArray(str.length)
    var tempPos = 0
    for (i in str.indices){
        if (tempArray.contains(str[i]))
            continue
        else{
            for(y in i+1..<str.length){
                if(str[i] == str[y]){
                   tempArray[tempPos++] = str[y]
                   counter++
                    break
                }
            }
        }
    }
    return counter
}