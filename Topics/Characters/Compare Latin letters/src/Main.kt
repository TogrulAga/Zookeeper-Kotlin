fun main() {
    arrayOfNulls<Char>(2)
        .map { readln().first().lowercaseChar() }
        .reduce { acc, c -> println(acc == c); return; }
}