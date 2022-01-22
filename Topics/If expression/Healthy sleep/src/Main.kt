fun main() {
    val minHours = readln().toInt()
    val maxHours = readln().toInt()
    val hours = readln().toInt()

    println(
        if (hours < minHours) {
            "Deficiency"
        } else if (hours > maxHours) {
            "Excess"
        } else {
            "Normal"
        }
    )
}