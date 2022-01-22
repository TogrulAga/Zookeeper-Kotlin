fun main() {
    arrayOfNulls<String>(2)
        .map { readln() }
        .reduceOrNull { acc, s -> println(acc.toInt().toChar() == s.first()); return; }
}