fun main() {
    val number = readln().toInt()

    if (number < 0) {
        println("negative")
    } else if (number > 0) {
        println("positive")
    } else {
        println("zero")
    }
}