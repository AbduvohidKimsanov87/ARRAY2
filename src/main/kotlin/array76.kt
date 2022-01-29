fun main() {
    var array= intArrayOf(2,1,8,5,6,3,1,4,7,9,5,2)
    for (index in 1 until array.size-1){
        if (array[index]>array[index-1] && array[index]>array[index+1]){
            array[index]=0
        }
    }
    println(array.joinToString())

}