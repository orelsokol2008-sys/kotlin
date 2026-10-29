package kg.kkc.labs.lab03

fun main() {
    print("Enter temperature (°C): ")
    val temp = readln().toInt()
    if (temp < 0) {
        println("Freezing")
    } else if (temp <= 14) {
        println("Cold")
    } else if (temp <= 24) {
        println("Mild")
    } else {
        println("Warm")
    }
}
