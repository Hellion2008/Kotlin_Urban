package modul4.hw4

class Registration {
    private lateinit var email :String
    private lateinit var password :String

    fun getEmail() = email.uppercase()

    fun setEmail (line: String) {
        email = line
    }

    fun setPassword (line: String) {
        if (line.length < 6){
            println("Слишком короткий пароль")
        } else{
            password = line
        }
    }

    override fun toString(): String {
        return "User: $email"
    }
}