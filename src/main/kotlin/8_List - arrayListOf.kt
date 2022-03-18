fun main() {

    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array                    : ")
    for(item in arrayList){
        print("$item ")
    }
    print("\n")

    // menambahkan data pada array
    arrayList += 9
    print("Tambahkan elemen 9 dalam arrayList : ")
    println(arrayList)

    // membalikkan data pada array
    arrayList.reverse()
    print("Reverse arrayList                  : ")
    println(arrayList)

    // menghapus data pada array, data yang terhapus adalah data terakhir
    arrayList -= 1
    print("Remove last element in arrayList   : ")
    println(arrayList)

    // menambahkan data range pada array
    arrayList += (1..5)
    print("Add range in arrayList             : ")
    println(arrayList)

}