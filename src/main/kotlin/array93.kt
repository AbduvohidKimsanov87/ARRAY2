fun main() {
    val array= intArrayOf(4,5,8,7,25,41,8,7,96,3,25,8,7,4,5,9,8)
    val arrayb=IntArray(array.size/2+1)
    var count=0
    for (index in 0 until array.size step 2){
        arrayb[count++]=array[index]
    }
    println(arrayb.joinToString())
    println(count)
}