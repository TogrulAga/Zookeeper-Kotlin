fun main() {
    val number = readln().toInt()
    val divisors = mutableListOf<Int>(2, 3, 5, 6)

    for (divisor in divisors) {
        if (number % divisor == 0) {
            println("Divided by $divisor")
        }
    }
}