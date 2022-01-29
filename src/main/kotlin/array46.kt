import kotlin.math.abs

fun main() {
    var min=Int.MAX_VALUE
    var sum=0
    var r=22
    var array= intArrayOf(8,5,6,7,9,10,11,15,18)
    for (index in 0 .. array.size-2){
        if (abs(array[index]+array[index+1]-r)<min){
            min=abs(array[index]+array[index+1]-r)
            sum=index
        }
    }
    println("first index=$sum and second=${sum+1}")
}