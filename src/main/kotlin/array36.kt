fun main() {
    var max=Int.MIN_VALUE
    var array= intArrayOf(5,1,2,9,6,5,4,8,7,1,2,4,6)
    for (index in 1..array.size-2){
        if (array[index]>array[index+1] && array[index]>array[index-1] || array[index]<array[index+1] && array[index]<array[index-1]){
            continue

        }
        if (max<array[index]){
            max=array[index]
            println(max)
        }

    }
    println(max)
}