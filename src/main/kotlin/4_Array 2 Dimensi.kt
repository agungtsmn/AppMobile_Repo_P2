fun main() {

    // menentukan isi untuk variabel cinema
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }

    // perulangan di dalam perulangan
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }


    cinema[2][2] = 1
    for (i in 1..3) { // mengulang untuk array index ke 1 - 3
        cinema[3][i] = 1 // memberikan nilai 1 pada isi array ke 3
    }
    for (i in 0..4) { // mengulang untuk array index ke 0 - 4
        cinema[4][i] = 1 // memberikan nilai 1 pada isi array ke 4
    }
    println()
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

}