fun main() {
    var sum=0
    val array= intArrayOf(2,1,4,3,9,5,8,7,)
    for (index in 0 until array.size step 2){
        if (array[index]-array[index+1]==1){
            sum=0
        }
        else{
            sum=index
            break
        }
    }
    println(sum)
}