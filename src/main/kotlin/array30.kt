fun main() {
    var count=0
    val array= intArrayOf(5,2,1,9,2,8,5,4,6,2,8,7,)
    for (index in 1..array.size-1){
        if (array[index]<array[index-1]){
            println(index-1)
            count++
        }
    }
    println(count)
}