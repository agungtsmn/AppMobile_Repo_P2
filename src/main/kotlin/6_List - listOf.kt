fun main() {

    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}") // menampilkan jumlah data pada array
    println("Third element: ${numbers.get(2)}") // menampilkan data pada index ke 2
    println("Fourth element: ${numbers[3]}") // menampilkan dta pada index ke 3
    println("Index of element \"two\" ${numbers.indexOf("two")}") // menampilkan posisi index pada data "two"

//    val bob = Person("Bob", 31)
//    val people = listOf<Person>(Person("Adam", 20), bob, bob)
//    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
//    println(people == people2)
//    bob.age = 32
//    println(people == people2)

}

// Terdapat error pada "Person" dan ".age"