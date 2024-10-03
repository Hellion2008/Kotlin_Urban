package modul4.hw6

class BankCard (number : Int, code: Int, val password: String){

    val number: Int = number

    private val code = code

    fun showInfo(password: String){
        if (this.password == password)
            println("Номер: $number, код: $code")
        else
            println("Неверный пароль")
    }
}