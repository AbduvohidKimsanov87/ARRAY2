fun main() {
    val array= intArrayOf(4,7,6,8,2,1,3,9,5,3)
    for (index in array.size-1 downTo 1){
        array[index]=array[index-1]

    }
    array[0]=0
    println(array.joinToString())
}