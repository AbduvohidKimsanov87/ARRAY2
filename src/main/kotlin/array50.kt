fun main() {
    var array= intArrayOf(2,5,4,6,3,9,3,4,1,8)
    var count=0
    for (index in 0 until array.size-1){
        if (array[index]>array[index+1]){
            count++
        }
    }
    println(count)
}