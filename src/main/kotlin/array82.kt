fun main() {
    val k=3
    val array= intArrayOf(4,8,7,3,2,1,6,9,8,5,4,7,8,2,9)
    for (index in 0 until array.size-1-k){
        array[index]=array[index+k]
    }
    for (i in array.size-k ..array.size-1){
        array[i]=0
    }
    println(array.joinToString())
}