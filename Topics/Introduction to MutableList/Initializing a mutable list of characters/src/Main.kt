fun main() {
    val characters = readln().split(regex = ",\\s".toRegex())

    println(characters.joinToString())
}