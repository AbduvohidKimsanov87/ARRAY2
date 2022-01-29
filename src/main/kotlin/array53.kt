fun main() {
    var arraya= intArrayOf(3,5,4,8,9,2,1,6)
    var arrayb= intArrayOf(2,4,3,7,1,5,8,7)
    var arrayc=IntArray(arraya.size)
    for (i in arrayc.indices){
        if (arraya[i]>arrayb[i]){
            arrayc[i]=arraya[i]
        }
        else{
            arrayc[i]=arrayb[i]
        }
    }
    println(arrayc.joinToString())
}