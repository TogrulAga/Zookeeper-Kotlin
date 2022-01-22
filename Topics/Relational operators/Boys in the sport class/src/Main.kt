fun main() {
    println(
        arrayOfNulls<Int>(3)
            .map { readln().toInt() }
            .let { it[0] >= it[1] && it[1] >= it[2] || it[0] <= it[1] && it[1] <= it[2] }
    )
}