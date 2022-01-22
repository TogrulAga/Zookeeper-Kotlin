fun main() {
    val number = readln().toInt()
    val numbers = mutableListOf(number)
    while (numbers.lastOrNull() != 1) {
        numbers.add(
            if (numbers.lastOrNull()!!.rem(2) == 0) {
                numbers.lastOrNull()!! / 2
            } else {
                numbers.lastOrNull()!! * 3 + 1
            }
        )
    }
    println(numbers.joinToString(separator = " "))
}