fun main() {
    val arraya= intArrayOf(1,3,4,2,8,1,3,4,6,2,5)
    var count=0
    var sum=0
    val arrayb=IntArray(arraya.size)
    for (index in arraya.size-1 downTo 0){
        count++
        sum+=arraya[index]
        arrayb[index]=sum/count
    }
    println(arrayb.joinToString())
}