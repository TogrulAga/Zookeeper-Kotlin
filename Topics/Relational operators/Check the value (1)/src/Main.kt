fun main() {
    println(arrayOfNulls<Int>(1).map { readln().toInt() }.all { t -> t in 1..9 })
}