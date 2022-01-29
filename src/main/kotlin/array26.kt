fun main() {
    var array= intArrayOf(3,5,7,9,12,13,15,17)
    var result=0
    var sum=0
    for ((index,item) in array.withIndex() )
        if (array[index]%2==1){
            sum=result
        }else{
            sum=index
            break
        }

    println(sum)
}