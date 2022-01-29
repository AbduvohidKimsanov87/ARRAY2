fun main() {
    val array= intArrayOf(5,8,4,9,6,3,1,7,5,2,4,8,6,4)
    println(array.joinToString ())
    for (index in array.size-1 downTo 1 ){
        array[index]=array[index-1]
    }
    array[0]=4
    println(array.joinToString())
}