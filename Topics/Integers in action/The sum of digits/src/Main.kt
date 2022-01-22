fun main() {
    var integer = readLine()!!.toInt()
    var sum = 0
    for (i in 0..2) {
        sum += integer % 10
        integer /= 10
    }
    println(sum)

}