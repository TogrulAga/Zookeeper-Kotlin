fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this lin

    val hours = totalSeconds / 3600
    val rem: Long = totalSeconds % 3600
    val minutes = rem / 60
    val seconds = rem % 60

    println("hello")
    println("${hours}:${minutes}:${seconds}")
}