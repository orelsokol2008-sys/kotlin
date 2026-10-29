package kg.kkc.kotlinlabs.lab01

fun main() {
    print("First name: ")
    val firstName = readln()
    print("Last name: ")
    val lastName = readln()
    print("City: ")
    val city = readln()

    val card = "Name: $firstName $lastName\nCity: $city"
    println(card)
}
