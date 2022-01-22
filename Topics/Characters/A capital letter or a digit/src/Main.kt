fun main() {
    arrayOfNulls<Int>(1)
        .map { readln().first().code }
        .forEach { t -> println(t in 49..57 || t in 65..90) }
}