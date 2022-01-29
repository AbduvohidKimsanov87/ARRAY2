fun main() {
    var array= intArrayOf(12,15,18,19,21,25,28,47,55,23)
    for (index in array.size-1 downTo 1 ){
        if (array[index]>array[index-1]){
            break
        }
        var sum=array[index-1]
        array[index-1]=array[index]
        array[index]=sum
    }
    println(array.joinToString())
}