import kotlin.math.abs

fun main() {
    var min=Int.MAX_VALUE
    var sum=0
    var array= intArrayOf(8,2,14,18,5,9,11,12,19,21)
    for (index in 0..array.size-2){
        if (abs(array[index]-array[index+1])<min){
            min=abs(array[index]-array[index+1])
            sum=index
        }
    }
    println("first index=$sum and second=${sum+1}")
}