import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Int>()

    while (scanner.hasNext()) {
        numbers.add(scanner.nextInt())
    }
    println("${numbers.maxOrNull()} ${numbers.indexOfFirst { it == numbers.maxOrNull() } + 1}")
}