import kotlin.math.pow

fun main() {
    val number = readln().toInt()
    var i = 1.0
    while (i.pow(2) <= number) {
        println(i.pow(2).toInt())
        i++
    }
}