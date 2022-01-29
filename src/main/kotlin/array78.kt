fun main() {
    val array= intArrayOf(1,9,5,4,7,3,6,2,5,8,4,1)
    for (index in 0 until array.size-2 ){
        array[index]=(array[index]+array[index+1])/2

    }
    println(array.joinToString())
}