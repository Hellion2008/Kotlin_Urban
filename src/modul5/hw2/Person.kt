package modul5.hw2

class Person(val name: String) {

    private val tickets: Array<Ticket?> =  arrayOfNulls(10)

    fun buyTicket(title: String,
                  cinemaName: String,
                  time: String): Ticket{
        return Ticket(title, cinemaName, time)
    }

    fun addTicketToStory(ticket: Ticket){
        for (i in tickets.indices){
            if (tickets[i] == null) {
                tickets[i] = ticket
                return
            }
        }
        println("Нет столько карманов,чтобы засунуть все билеты!")
    }

    fun showTickets(){
        for (ticket in tickets){
            println(ticket)
        }
    }
}