fun main() {
    var max=Int.MIN_VALUE
    var min=Int.MAX_VALUE
    var array= intArrayOf(5,3,2,7,3,5,7,4,8,6)
    for (index in 1..array.size-2){
        if (array[index]<array[index-1] && array[index]<array[index+1]){
            min=array[index]
            println(min)
            if (min>array[index]){
                min=array[index]
            }
        }

    }
    println(min)

}