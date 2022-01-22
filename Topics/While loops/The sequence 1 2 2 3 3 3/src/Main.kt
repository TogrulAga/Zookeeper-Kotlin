fun main() {
    var n = readln().toInt()
    var i = 1

    while (n > 0) {
        if (n - i > 0) {
            print("$i ".repeat(i))
        } else {
            print("$i ".repeat(n))
        }

        n -= i
        i++
    }

}