fun main() {
    val (a, b, c) = MutableList(3) { readln().toInt() }

    if (a + b > c && a + c > b && b + c > a) {
        println("YES")
    } else {
        println("NO")
    }
}