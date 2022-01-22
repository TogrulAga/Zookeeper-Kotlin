fun main() {
    val n = readln().toInt()
    val detections = mutableListOf<Int>()

    repeat(n) { detections.add(readln().toInt()) }

    val nPerfect = detections.count { it == 0 }
    val nLarger = detections.count { it == 1 }
    val nSmaller = detections.count { it == -1 }

    println("$nPerfect $nLarger $nSmaller")
}