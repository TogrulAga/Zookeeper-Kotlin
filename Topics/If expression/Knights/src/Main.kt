import kotlin.math.pow

fun main() {
    val coordinate1 = readln().split(regex = " ".toRegex()).map { it.toDouble() }.toMutableList()
    val coordinate2 = readln().split(regex = " ".toRegex()).map { it.toDouble() }.toMutableList()

    if ((coordinate1[0] - coordinate2[0]).pow(2.0) + (coordinate1[1] - coordinate2[1]).pow(2.0) == 5.0) {
        println("YES")
    } else {
        println("NO")
    }
}