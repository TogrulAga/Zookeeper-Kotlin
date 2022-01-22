fun main() {
    val list = arrayOfNulls<Int>(3).map { readln().first().code }

    for (x in 0..1) {
        if (list[x] + 1 != list[x + 1]) {
            println(false)
            return
        }
    }
    println(true)
}