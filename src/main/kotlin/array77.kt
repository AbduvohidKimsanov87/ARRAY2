fun main() {
    var array= intArrayOf(2,1,8,5,6,3,5,4,7,9,5,2)
    var arrayb=IntArray(array.size)
    for (index in 0 until array.size){
        arrayb[index]=array[index]
    }
    for (index in 1 until array.size-1){
        if (array[index]<array[index-1] && array[index]<array[index+1]){
            arrayb[index]=array[index]*array[index]

        }


    }
    println(arrayb.joinToString())
}