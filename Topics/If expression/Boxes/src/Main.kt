fun main() {
    val (x1, y1, z1) = readln().split(" ").toMutableList().map { it.toInt() }.sorted()
    val (x2, y2, z2) = readln().split(" ").toMutableList().map { it.toInt() }.sorted()

    if (x1 == x2 && y1 == y2 && z1 == z2) {
        println("Box 1 = Box 2")
    } else if (x1 >= x2 && y1 >= y2 && z1 >= z2) {
        println("Box 1 > Box 2")
    } else if (x1 <= x2 && y1 <= y2 && z1 <= z2) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
}