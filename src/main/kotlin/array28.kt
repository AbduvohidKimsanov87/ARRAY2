fun main() {
    var min=Int.MAX_VALUE
    var array= intArrayOf(5,8,4,5,9,6,3,2,7,1,5,2)
    var sum=0
    for (index in 0..array.size-1 step 2){
        if (min>=array[index]){
            min=array[index]

        }
        println(array[index])
    }
    println("result= $min")
}