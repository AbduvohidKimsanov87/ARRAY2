import kotlin.math.abs

fun main() {
    val array= intArrayOf(14,21,35,48,76,21,32,54,11,47)
    var max=Int.MIN_VALUE
    var min=Int.MAX_VALUE
    var minIndex=0
    var maxIndex=0
    for ((index,item) in array.withIndex()){
        if (max<item){
            max=item
            maxIndex=index
        }
        if (min>item) {
            min = item
            minIndex = index
        }
    }
    println("$max $maxIndex  $min $minIndex")
    val size= abs((maxIndex-minIndex))/2
    if (minIndex>maxIndex){
        for (index in 0 until size){
            val sum=array[maxIndex+index]
            array[maxIndex+index]=array[minIndex-index]
            array[minIndex-index]=sum
        }
    }else{
        for (index in 0 until size){
            val sum=array[minIndex+index]
            array[minIndex+index]=array[maxIndex-index]
            array[maxIndex-index]=sum
        }

    }
    println(array.joinToString())

}