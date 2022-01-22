fun main() {
    val longs = MutableList(3) { 100_000_000_001 }.mapIndexed { index, l -> index + l }

    // do not touch the lines below
    println(longs.joinToString())
}