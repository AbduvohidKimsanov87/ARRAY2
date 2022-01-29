fun main() {
    var array= intArrayOf(8,5,4,7,6,9,3,2,4)
    for (index in 1 until array.size){
        array[index-1]=array[index]
    }
    array[array.size-1]=0
    println(array.joinToString())
}