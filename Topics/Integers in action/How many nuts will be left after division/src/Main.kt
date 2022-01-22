fun main() {
    println(arrayOfNulls<Int>(size = 2).map { readln().toInt() }.reversed().reduce { acc, i -> acc % i })
}