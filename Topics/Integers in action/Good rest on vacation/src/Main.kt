fun main() {
    val days = readln().toInt()
    val foodCost = readln().toInt()
    val flightCost = readln().toInt()
    val hotelCost = readln().toInt()

    println(days * foodCost + 2 * flightCost + (days - 1) * hotelCost)
}