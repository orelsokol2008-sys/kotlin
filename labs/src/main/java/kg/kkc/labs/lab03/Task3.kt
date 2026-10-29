package kg.kkc.labs.lab03

fun main() {
    print("Enter age: ")
    val age = readln().toInt()
    print("Has ticket (yes/no): ")
    val ticketInput = readln()
    val hasTicket = ticketInput.equals("yes", ignoreCase = true)

    if (age < 12) {
        println("Too young")
    } else if (!hasTicket) {
        println("Need a ticket")
    } else {
        println("Enter")
    }
}
