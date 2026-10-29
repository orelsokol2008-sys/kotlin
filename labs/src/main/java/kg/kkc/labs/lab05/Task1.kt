package kg.kkc.labs.lab05

fun main() {
    /*
     * Explanation: Char represents a single 16-bit Unicode character enclosed in single quotes ('K'),
     * whereas String represents a sequence of characters enclosed in double quotes ("K").
     */
    val letter = 'K'
    val word = "K"
    println("letter = $letter")
    println("word = $word")
    println("word[0] == letter: ${word[0] == letter}")
}
