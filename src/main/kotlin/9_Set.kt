fun main() {

    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}") // menampilkan jumlah data array

    if (numbers.contains(1)) // mengecek nilai 1 pada array
        println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}") // menampilkan true / false pada kondisi "numbers == numbersBackwards"

    println(numbers.first() == numbersBackwards.first()) // false karena nilai pada numbers.first() sama dengan numbersBackwards.first()
    println(numbers.first() == numbersBackwards.last()) // true karena nilainya sama

    val strings = hashSetOf("a", "b", "c", "c") // hashSetOf membuat nilai yang sama tidak dimasukkan jadi array pada variabel string adalah ["a", "b", "c"]
    println("My Set Values are $strings")

}