fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(n) { numbers.add(readln().toInt()) }
    println(numbers.count { it > 0 })
}