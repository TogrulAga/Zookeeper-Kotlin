fun main() {
    val number = readln().toInt()
    println(if ((number + 1) % 2 == 0) number + 1 else number + 2)
}