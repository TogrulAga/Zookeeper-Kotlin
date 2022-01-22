import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do {
        val next = scanner.nextInt()
        if (next == 0) {
            break
        }
        sum += next
    } while (scanner.hasNext())

    println(sum)
}