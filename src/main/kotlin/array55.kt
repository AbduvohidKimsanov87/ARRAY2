fun main() {
    val arraya= intArrayOf(5,1,2,9,8,3,7,4,5,2,7,3)
    val arrayb=IntArray(arraya.size/2)
    var count=0
    for (index in 1 until arraya.size step 2){
        arrayb[count]=arraya[index]
        count++
    }
    println("${arrayb.joinToString()} size $count ")

}