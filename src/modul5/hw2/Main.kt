package modul5.hw2

fun main() {
    val titles = arrayOf("Batman", "Spider-man", "Green book", "Top Gun", "Shining", "Dracula")
    val cinemas = arrayOf("Mirag", "Karo", "DK")
    val times = arrayOf("19:00", "20:00", "21:00", "22:00")

    val person = Person("Bruce")
    repeat(11){
        person.addTicketToStory( Ticket(
            titles.random(),
            cinemas.random(),
            times.random())
        )
    }
    person.showTickets()

}