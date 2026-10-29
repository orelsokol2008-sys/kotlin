package kg.kkc.labs.lab04

fun main() {
    var choice: Int
    do {
        println("1) Hello")
        println("2) Quit")
        print("Enter choice: ")
        choice = readln().toInt()
        when (choice) {
            1 -> println("Hello!")
            2 -> println("Quitting...")
            else -> println("Unknown")
        }
    } while (choice != 2)
}
