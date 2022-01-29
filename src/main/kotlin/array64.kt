fun main() {
    val arraya= intArrayOf(9,7,5,4,3,2)
    val arrayb= intArrayOf(15,12,8,7,3,1)
    val arrayc= intArrayOf(17,14,10,8,6,2)
    val arraye=IntArray(arraya.size*3)
    val arrayd=IntArray(arraya.size*3)
    var count=0
    var sum=0
    var min=Int.MAX_VALUE
    for (index in 0 until arraya.size ){
        arraye[count]=arraya[index]
        count++
        arraye[count]=arrayb[index]
        count++
        arraye[count]=arrayc[index]
        count++

    }
    var indexOfMin=-1
    var count1 = 0
    for (index in 0 until arraye.size){
        for (innerIndex in 0 until arraye.size)
        if (arraye[innerIndex] < min){
            if (index ==indexOfMin){
                continue
            }
            min=arraye[innerIndex]
            indexOfMin=innerIndex
            arrayd[count1]=min
        }
        count1++
    }
    println(arraye.joinToString())
    println(arrayd.joinToString())
}