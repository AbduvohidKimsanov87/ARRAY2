fun main() {
    var max=Int.MIN_VALUE
    var array= intArrayOf(1,4,3,2,8,9,5,4,7)
    var item=0
    for (index in 0..array.size-2){
        if (array[index]+array[index+1]>max){
            max=array[index]+array[index+1]
            item=index
        }
    }
    println("${array[item]} ${array[item+1]}")
}