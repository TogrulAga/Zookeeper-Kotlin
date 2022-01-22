fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    if (a >= b) {
        println(a)
    } else if (b > a) {
        println(b)
    }
}