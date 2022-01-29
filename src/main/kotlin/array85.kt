fun main() {
    val array = intArrayOf(5, 8, 9, 6, 1, 7, 4, 5, 6, 3, 12, 4, 2, 7, 3)
//    val a = IntArray(4)
    val k = 3
    println(array.joinToString())
    for (index in array.size - 1 downTo k) {
        array[index] = array[index - k]
    }
    println(array.joinToString())
}