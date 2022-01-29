fun main() {
    var array= intArrayOf(1,5,2,1,8,4,6)
    var min=0
    for ((item,index) in array.withIndex()){
        if (item<array.last() && item>array.first()){

            min=index

        }

    }
    println(min)

}