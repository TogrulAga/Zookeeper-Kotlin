fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()

    repeat(n) { numbers.add(readln().toInt()) }
    println(numbers.filter { it % 4 == 0 }.maxOrNull())
}