import kotlin.math.abs

fun main() {
    val coordinate1 = readln().split(regex = " ".toRegex()).map { it.toDouble() }.toMutableList()
    val coordinate2 = readln().split(regex = " ".toRegex()).map { it.toDouble() }.toMutableList()

    if (coordinate1[0] == coordinate2[0] || coordinate1[1] == coordinate2[1]) {
        println("YES")
    } else if (abs(coordinate1[0] - coordinate1[1]) == abs(coordinate2[0] - coordinate2[1])) {
        println("YES")
    } else if (abs(coordinate1[0] - coordinate2[0]) == abs(coordinate1[1] - coordinate2[1])) {
        println("YES")
    } else {
        println("NO")
    }
}