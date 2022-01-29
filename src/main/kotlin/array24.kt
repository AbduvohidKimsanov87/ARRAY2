fun main() {
    var array= intArrayOf(1,4,7,10,13,16,19,22)
    var sum=0
    for (index in 1.. array.size-1){
        sum=array[index]-array[index-1]
        if (sum!=3){
         sum=0
            break
        }

    }
    println(sum)
}