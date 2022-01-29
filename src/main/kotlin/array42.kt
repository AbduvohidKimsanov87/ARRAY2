fun main() {
    var r=12
    var array= intArrayOf(10,54,32,11,10,9,5,7,9)
    var min=Int.MAX_VALUE
    var item=0
    for (index in 0..array.size-2){
        if (array[index]+array[index+1]-r<=min){
            min=array[index]+array[index+1]-r
            item=index
        }
    }
    println("${array[item]} ${array[item+1]}")
}