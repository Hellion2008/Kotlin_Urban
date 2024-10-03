package modul5.hw2

data class Ticket(
    val title: String,
    val cinemaName: String,
    val time: String) {

    override fun toString() = "\"$title\": время - $time, кинотеатр - $cinemaName"
}