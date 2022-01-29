fun main() {
    val arraya= intArrayOf(1,5,-8,-3,9,-7,5,3-5,4,-9,7,6,-4,7)
    var countmusbat=0
    var countmanfiy=0
    var indexB=0
    var indexC=0
    for (item in arraya){
        if (item>0){
            countmusbat++

        }else{
            countmanfiy++

        }
    }
    val arrayb= intArrayOf(countmusbat)
    val arrayc= intArrayOf(countmanfiy)
    arraya.forEach {
        if (it>0){
            arrayb[indexB]=it
            indexB++
        }else{
            arrayc[indexC]=it
            indexC++
        }
    }
    println(arraya.joinToString())
    println("${arrayb.joinToString()} sum=$countmusbat")
    println("${arrayc.joinToString()} sum=$countmanfiy")

}