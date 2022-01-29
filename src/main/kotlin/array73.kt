fun main() {
    var array= intArrayOf(5,4,7,6,9,2,3,1,5,4,8,7)
    var k=2
    var h=7
    for (index in 1 until 3){
        var sum=array[k+index]
        array[k+index]=array[h-index]
        array[h-index]=sum
    }
    println(array.joinToString())
}