fun main() {
    val numbers = readln().split(regex = ",\\s".toRegex()).toMutableList().map { it.toInt() }

    // do not touch the lines below 
    println(numbers.joinToString())
}