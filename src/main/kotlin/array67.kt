fun main() {
    val array= intArrayOf(5,9,7,5,3,2,1,4,9,7,6,2,4)
    var ohirgiToq=0
    for (index in array.size-1 downTo 0){
        if (array[index]%2==1){
            ohirgiToq=array[index]
            break
        }
    }
    for (index in array.indices){
        if (array[index]%2==1){
            array[index]+=ohirgiToq
        }


    }
    println(array.joinToString())
}