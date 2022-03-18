fun main() {

    // penggunaan Array Integer
    val x : IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach {
        print(it.toString() + " ")
    }
    println("")

    // penggunaan Array Byte
    val bA = ByteArray(5)
    bA.forEach {
        print(it.toString() + " ")
    }
    println("")

    // penggunaan Array Short
    val sA = ShortArray(5) { 42 }
    sA.forEach {
        print(it.toString() + " ")
    }
    println("")

    // penggunaan Array Integer
    var iA = IntArray(5) { it * 1 }
    iA.forEach {
        print(it.toString() + " ")
    }
    println("")

}