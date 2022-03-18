fun main() {

    var arrA = arrayOf<Int>()  // mendeklarasikan variabel array (Integer)
    arrA += 20 // memberikan nilai pada variabel
    println(arrA[0]) // menampilkan nilai pada index ke 0 di variabel arrA

    var arrB = arrayOf<Int>()
    for (i in 1..10){ // perulangan sebanyak 10 x
        arrB += i // memberikan nilai di variabel arrB sebanyak perulangan
    }

    for (i in arrB){ // perulangan sebanyak data pada array arrB
        print("$i ") // menampilkan isi array
    }

}