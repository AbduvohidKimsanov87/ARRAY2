fun main() {
    var summax=0
    var summin=0
    val array= intArrayOf(5,8,9,6,3,2,1,4,7,5)
    for (index in array.size-1 downTo 0){
        summax=array[index]

    }
    for (i in 0 until array.size){
        array[i]=summax
    }


    println(array.joinToString())


}