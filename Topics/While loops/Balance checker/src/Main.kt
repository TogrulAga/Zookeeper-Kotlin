import java.util.*
import kotlin.system.exitProcess

fun main() {
    var balance = readln().toInt()
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        val purchase = scanner.nextInt()
        if (balance >= purchase) {
            balance -= purchase
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            exitProcess(0)
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}