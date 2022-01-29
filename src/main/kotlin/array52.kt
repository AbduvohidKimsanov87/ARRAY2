fun main() {
    val arraya= intArrayOf(6,8,2,1,3,8,9,4)
    val arrayb=IntArray(arraya.size)
    for (i in 0 until arraya.size){
        if (arraya[i]<5){
            arrayb[i]=2*arraya[i]
        }
        else{
            arrayb[i]=arraya[i]/2
        }
    }
    println(arrayb.joinToString())
}