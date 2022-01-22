fun main() {
    val number = readln().toLong()

    println(
        (number in -14..12 || number in 15..16 || number in 19..Long.MAX_VALUE).toString()
            .replaceFirstChar { it.uppercaseChar() }
    )
}