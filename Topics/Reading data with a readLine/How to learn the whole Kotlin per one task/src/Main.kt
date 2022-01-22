fun main() {
    println(arrayOfNulls<String>(size = 5).map { readLine() }.joinToString(separator = " "))
}