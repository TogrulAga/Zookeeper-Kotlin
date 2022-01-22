fun main() {
    val time = readln().split(regex = " ".toRegex()).joinToString(separator = ":")
    val date = readln().split(regex = " ".toRegex()).joinToString(separator = "/")
    println("$time $date")
}