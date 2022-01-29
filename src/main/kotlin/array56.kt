fun main() {
    var arraya= intArrayOf(4,9,8,2,6,1,3,4,7,9)
    var arrayb=IntArray(arraya.size/3)
   var count=0
    for (i in 2 until arraya.size step 3){
            arrayb[count]=arraya[i]
        count++
    }
    println(arrayb.joinToString())

}