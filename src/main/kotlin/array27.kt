fun main() {
    val array= intArrayOf(-3,5,-7,9,-12,13,-15,-17)
    var sum=0
    for (item in 0 until array.size-1){
        if ((array[item]<0 && array[item+1]>0) || (array[item]>0 && array[item+1]<0)) {
            sum=0
        }else{
            sum=item+1

        }

    }
    println(sum)

}