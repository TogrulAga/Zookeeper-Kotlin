const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val hours1 = readln().toInt()
    val minutes1 = readln().toInt()
    val seconds1 = readln().toInt()

    val hours2 = readln().toInt()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()

    println((hours2 - hours1) * SECONDS_IN_HOUR + (minutes2 - minutes1) * SECONDS_IN_MINUTE + seconds2 - seconds1)
}