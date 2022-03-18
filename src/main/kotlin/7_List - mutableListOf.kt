fun main() {

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5) // menambahkan data 5 pada array
    numbers.removeAt(1) // menghapus data pada index ke 1
    numbers[0] = 0 // merubah data di index ke 0 menjadi 0
    numbers.shuffle() // mengacak posisi data pada array
    println(numbers)

    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") // menambahkan data "five" pada array
    println(numbersStr)

}