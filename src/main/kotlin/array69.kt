fun main() {
    val array= intArrayOf(4,5,3,2,1,8,9,7,4,6,5,8)
    var sum2=0
    var sum1=0
    for (index in 0 until array.size-1 step 2){
        sum2=array[index+1]
        sum1=array[index]
        array[index+1]=sum1
        array[index]=sum2
    }
    println(array.joinToString())
}