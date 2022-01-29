fun main() {
    var k=5
    var array= intArrayOf(1,3,9,4,7,2,5,6,9)
    var sum =0
    val a=array[k]
    for (index in 0 until array.size){
        sum=array[index]+a
        array[index]=sum
        sum=0

    }

    println(array.joinToString())
}