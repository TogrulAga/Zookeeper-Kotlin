fun main() {
    println(arrayOfNulls<Int>(size = 3).map { readln().toInt() }.parallelStream().distinct().count() == 3L)
}