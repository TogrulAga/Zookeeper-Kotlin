import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var count = 0

    do {
        val next = scanner.nextInt()
        if (next == 0) {
            break
        }
        count++
    } while (scanner.hasNext())

    println(count)
}