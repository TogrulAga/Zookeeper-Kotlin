import kotlin.math.ceil

fun main() {
    val class1 = ceil(readLine()!!.toFloat() / 2)
    val class2 = ceil(readLine()!!.toFloat() / 2)
    val class3 = ceil(readLine()!!.toFloat() / 2)
    println((class1 + class2 + class3).toInt())
}