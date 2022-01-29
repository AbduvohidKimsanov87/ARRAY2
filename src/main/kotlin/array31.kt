fun main() {
    var array= intArrayOf(4,5,2,6,8,1,3,5,7,)
    var count=0
    for (index in array.size-1 downTo 1){
        if (array[index]>array[index-1]){
            println(index)
            count++
        }
    }
    println("sum =$count")
}