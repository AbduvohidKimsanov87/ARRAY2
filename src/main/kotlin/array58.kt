fun main() {
    var arraya= intArrayOf(1,3,4,2,8,6,3,7,9,1,2,4,1,3)
    var arrayb=IntArray(arraya.size)
    var sum=0
    for (index in arraya.indices){
        sum+=arraya[index]
        arrayb[index]=sum
    }
    println(arrayb.joinToString())
}