import java.util.Scanner

const val NWORDS = 5
const val START = 1

fun main() {
    val scanner = Scanner(System.`in`)

    for (i in START..NWORDS) {
        println(scanner.next())
    }
}