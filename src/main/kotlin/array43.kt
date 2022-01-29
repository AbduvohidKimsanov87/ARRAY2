fun main() {
    var array= intArrayOf(1,4,4,5,6,7,7,8,9)
    var count=0
    for (index in 0..array.size-2){
        if (array[index]==array[index+1]){
            count++
            continue
        }
    }
    println("${array.size-2*count}")
}