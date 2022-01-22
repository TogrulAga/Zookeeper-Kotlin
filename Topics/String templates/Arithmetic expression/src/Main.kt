fun main() {
    val (first, second) = MutableList(2) { readln().toInt() }
    println("$first plus $second equals ${first + second}")
}