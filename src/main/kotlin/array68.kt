fun main() {
    var min=Int.MAX_VALUE
    var max=Int.MIN_VALUE
    val array = intArrayOf(8,4,6,1,2,4,9,6)
    var minIndex=0
    var maxIndex=0
    for ((index,item) in array.withIndex()){
       if (item>max){
           max=item
           maxIndex=index
       }
        if (item<min){
            min=item
            minIndex=index
        }


    }
    array[minIndex]=max
    array[maxIndex]=min

    println(array.joinToString())
}