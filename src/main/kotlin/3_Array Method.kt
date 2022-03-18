fun main() {

    // penggunaan sort
    val valoA = arrayOf("Chamber", "Viper", "Astra", "Breach", "Yoru") // data array
    valoA.sort() // menyusun isi data array dari abjad A ke Z
    for (valo in valoA) {
        print(valo + ' ')
    }
    println("\n")

    // penggunaan sortedArray
    val valoB: Array<String> = arrayOf("Chamber", "Viper", "Astra", "Breach", "Yoru") // data array (String)
    val valo_sorted = valoB.sortedArray() // menyusun isi data array dari abjad A ke Z
    for (valo in valo_sorted) {
        print(valo + ' ')
    }
    println("\n")

    // penggunaan reverse
    val valoC: Array<String> = arrayOf("Chamber", "Viper", "Astra", "Breach", "Yoru")
    valoC.sort() // menyusun isi data array dari A ke Z
    valoC.reverse() // membalikkan isi data array
    for (valorant in valoC) {
        print(valorant + ' ')
    }
    println("\n")

    // penggunaan intexOf
    val valoD = arrayOf("Chamber", "Viper", "Astra", "Breach", "Yoru")
    val valo = "Yoru"
    val position = valoD.indexOf(valo) // mencari posisi dari "Yoru" di dalam array
    if (position != -1) { // memberikan kondisi dimana jika variabel position tidak sama dengan -1 maka true
        println("Yeah, that's my number ${position + 1} Valorant Agent! \n")
    } else {
        println("Hey that's not Valorant Agent! \n")
    }

    // penggunaan isEmpty
    val valoE = arrayOf("Chamber", "Viper", "Astra", "Breach", "Yoru")
    println("simpsons size: " + valoE.size) // menampilkan jumlah data array
    if(!valoE.isEmpty()) // memberi kondisi jika variabel valoE tidak kosong maka true
        println("Array tidak kosong!")
        println("Min = " + valoE.minOrNull()) // menampilkan data array abjad terkecil
        println("Max = " + valoE.maxOrNull()) // menampilkan data array abjad terbesar
        println("First = " + valoE.first()) // menampilkan data array pertama
        println("Last = " + valoE.last()) // menampilkan data array terakhir
        println(valoE.contains("Viper")) // menampilkan hasil true / false dari pencarian "Viper" di dalam array

}