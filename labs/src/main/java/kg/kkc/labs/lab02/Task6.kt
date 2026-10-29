package kg.kkc.labs.lab02

fun main() {
    /*
     * Explanation: Int might be a bad choice for the base value because 8,100,000,000 
     * exceeds Int.MAX_VALUE (~2.14 billion), leading to integer overflow.
     * Long provides 64 bits and can store up to ~9 quintillion.
     */
    val base = 8_100_000_000L
    print("Extra: ")
    val extra = readln().toInt()
    val total = base + extra.toLong()
    println("Base: $base")
    println("Extra: $extra")
    println("Total: $total")
}
