fun main() {
    val array= intArrayOf(18,7,9,12,14,16,17,19,20,25,85,96)
    for (index in 0 until array.size-1){
        if(array[index+1]>array[index] ){
            break
        }
        val sum = array[index+1]
        array[index+1]=array[index]
        array[index]=sum





    }

    println(array.joinToString())
}