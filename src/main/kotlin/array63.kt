fun main() {
    val arraya= intArrayOf(1,2,3,4)
    val arrayb= intArrayOf(5,6,7,8)
    val arrayc= IntArray(arraya.size+arrayb.size)
    var count=0
    var sum=0
    for (index in 0 until arraya.size ){
        sum=arraya[index]
        arrayc[index]=sum
        count++
        sum=0
    }
    for (index in 0 until arrayb.size){
        sum=arrayb[index]
        arrayc[count]=sum
        count++
        sum=0
    }
    println(arrayc.joinToString())

}