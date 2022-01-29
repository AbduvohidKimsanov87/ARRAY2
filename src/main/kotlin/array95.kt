fun main() {
    val array = intArrayOf(7, 4, 5, 5, 8, 6, 3, 3, 2, 1, 8, 8, 41, 55, 55,69,69)
    var count = 0
    val arrayb = IntArray(array.size )
    for (index in 0 until array.size - 1) {
        if (array[index] == array[index + 1]) {
            count++
            arrayb[count]=0


        } else {
            count++
            arrayb[count]=array[index+1]
            arrayb[index] = array[index]

        }

    }
    println(arrayb.joinToString())
}