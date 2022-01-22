fun main() {
    val n = readln().toInt()
    var nA = 0
    var nB = 0
    var nC = 0
    var nD = 0

    repeat(n) {
        when (readln().toInt()) {
            5 -> nA += 1
            4 -> nB += 1
            3 -> nC += 1
            2 -> nD += 1
        }
    }
    println("$nD $nC $nB $nA")
}