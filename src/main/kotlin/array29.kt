fun main() {
    var max=Int.MIN_VALUE
    val array= intArrayOf(5,8,4,5,9,6,3,2,7,1,5,2)
    for (index in 1..array.size-1 step 2){
        if (max<=array[index]){
            max=array[index]

        }
        println(array[index])

    }
    println("result= $max")
}