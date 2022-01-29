import kotlin.math.abs

fun main() {
    var min=Int.MAX_VALUE
    var element=0
    val R=83
    var array= intArrayOf(641,222,30,99,72,41,4,21,84,91,32)
    for (index in 0..array.size-1){
        if (abs(R-array[index])<min){
            min= abs(R-array[index])
            element=array[index]
        }
    }
    println(element)
}