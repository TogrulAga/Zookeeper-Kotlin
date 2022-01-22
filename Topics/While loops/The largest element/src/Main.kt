import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Int>()
    do {
        val next = scanner.nextInt()
        if (next == 0) {
            break
        }
        numbers.add(next)
    } while (scanner.hasNext())

    println(numbers.maxOrNull())
}