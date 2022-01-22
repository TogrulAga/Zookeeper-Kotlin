fun main() {
    val cups = readln().toInt()
    val isWeekend = readln().toBooleanStrict()

    if (isWeekend) {
        println(cups in 15..25)
    } else {
        println(cups in 10..20)
    }
}