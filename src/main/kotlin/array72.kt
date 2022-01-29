fun main() {
    val k=2
    val l=5
    val size=l-k+1/2
    val array= intArrayOf(1,2,4,6,5,7,8,8,3,2)
    for (index in 0 until size){
        val sum=array[k+index]
        array[k+index]=array[l-index]
        array[l-index]=sum
    }
    println(array.joinToString())


}
