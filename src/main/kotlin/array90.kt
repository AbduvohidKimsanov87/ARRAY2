fun main() {
    val array= intArrayOf(5,8,66,52,47,12,35,88)
    val arrayb=IntArray(array.size-1)
    val k=4
    println(array.joinToString())
    for (index in 0..4){
        arrayb[index]=array[index]
    }
    for (index in 4 until array.size-1){
        array[index]=array[index+1]
        arrayb[index]=array[index]



    }

    println(arrayb.joinToString())

}