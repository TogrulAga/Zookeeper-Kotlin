fun main() {
    println(arrayOfNulls<Int>(size = 3).map { readln().toInt() }.count { t -> t > 0 } == 1)
}